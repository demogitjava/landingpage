package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iWebSiteBuilder;
import de.jgsoftware.landingpage.service.interfaces.iWebBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebSiteBuilder implements iWebSiteBuilder
{



    java.util.Locale locale;
    ModelAndView mv;

    String htmlcomponent;

    String language;
    String component;


    @Autowired
    iWebBuilderService iWebBuilderService;



    @Override
    public ModelAndView lpagewebbuilder()
    {

        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        mv.addObject("loadedcountry", language);
        mv.addObject("loadedcomp", component);

        return mv;
    }


    @Override
    public String loadhtmlpage(String language, String component)
    {

        this.component = component;
        this.language = language;

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

            case "es":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.esloadheader();
                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.esloadcontent();
                }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.esloadfooter();
                }

                break;
            }

            case "it":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.itloadheader();

                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.itloadcontent();                }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.itloadfooter();
                }

                break;
            }

            case "tr":
            {

                if(component.equals("header"))
                {
                    htmlcomponent = iWebBuilderService.trloadheader();

                }
                else if(component.equals("body"))
                {
                    htmlcomponent = iWebBuilderService.trloadcontent();            }
                else if(component.equals("footer"))
                {
                    htmlcomponent = iWebBuilderService.trloadfooter();
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

    public String savehtmlpage(String language, String component)
    {



        return "redirect:/lpagewebbuilder";
    }



    /*

            save html and css data
            as html / css

     */
    @Override
    public String savehtmlcsstofile(
            @RequestParam(value = "gjshtml", required = false) String gjshtml,
            @RequestParam(value = "gjscss", required = false) String gjscss)

    {

        if(language == null && component == null)
        {
           System.out.print("can not save data to file");
        }
        else
        {
            iWebBuilderService.getiDaoWebBuilder().savehtmlandcss(gjshtml, gjscss, language, component);
        }






        return "header data saved";
    }



}
