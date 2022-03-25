package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.service.interfaces.iWebBuilderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import de.jgsoftware.landingpage.controller.interfaces.iWebSiteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.http.HttpServletRequest;


@Controller
public class WebSiteBuilder implements iWebSiteBuilder
{



    java.util.Locale locale;

    ModelAndView mv;

    ScriptEngine engine;

    String htmlcomponent;


    @Autowired
    iWebBuilderService iWebBuilderService;



    @Override
    public ModelAndView lpagewebbuilder()
    {

        // iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();



        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        return mv;
    }


    @Override
    public String loadhtmlpage(String language, String component)
    {



        switch(language)
        {
            case "de":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadheader(); // header

                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs(); // contentbody.html
                }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadfooter(); // footer
                }


                break;
            }
            case "fr":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.frloadheader();

                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.frloadcontent();                }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.frloadfooter();
                }

                break;
            }

            case "en":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.enloadheader();

                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.enloadcontent();                }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.enloadfooter();
                }

                break;
            }


            default:
            {
                break;
            }

        }


        return "redirect:/lpagewebbuilder";
    }







}
