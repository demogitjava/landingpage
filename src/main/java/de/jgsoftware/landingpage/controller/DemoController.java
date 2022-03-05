package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iDemoController;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoController implements iDemoController
{


    java.util.Locale locale;

    @Autowired
    IServiceIndex iServiceIndex;

    @Autowired
    HttpServletRequest request;

    public DemoController()
    {

    }

    // load default landingpage
    //@GetMapping({"index", "/"})
    @Override
    public ModelAndView demo() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("index");




        /**
         *   Get Country to display Language
         *   only for this Controller
         */
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();
        mv.addObject("lang", languagestr);


        /**
         *   load entities from table
         *   webtextlayout to contoller
         *
         *   inject text from with webtextcomp[0] fist id of table
         */
        mv.addObject("webtextcomp", iServiceIndex.getDcontroller().getPageLanguageText());



        return mv;
    }

    @Override
    public String login()
    {
        return "login";
    }

    @Override
    public String header()
    {
        return "header";
    }

    @Override
    public String fr()
    {
        return "fr";
    }



}
