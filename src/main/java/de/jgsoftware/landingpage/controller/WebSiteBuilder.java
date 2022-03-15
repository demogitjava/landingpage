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

import javax.servlet.http.HttpServletRequest;


@Controller
public class WebSiteBuilder implements iWebSiteBuilder
{



    java.util.Locale locale;





    @Autowired
    iWebBuilderService iWebBuilderService;



    @Override
    public ModelAndView lpagewebbuilder()
    {
        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("lpagewebbuilder");




        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcompp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        return mv;
    }


    @Override
    public String loadhtmlpage(String htmlpage)
    {


        return htmlpage;
    }


}
