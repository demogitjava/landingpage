package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iDemoController;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import de.jgsoftware.landingpage.model.areacodes;

import java.security.Principal;
import java.util.List;

@Controller
public class DemoController implements iDemoController
{


    java.util.Locale locale;
    @Autowired
    IServiceIndex iServiceIndex;
    @Autowired
    HttpServletRequest request;
    ModelAndView mv;

    Principal principal;

    @Override
    public ModelAndView de()
    {
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();

        principal = request.getUserPrincipal();

        mv = new ModelAndView("de");


        /*
                user login
         */
        if(principal == null)
        {
            System.out.print("not login");
        }
        else {
            mv.addObject("lgusername", principal.getName());

        }

        /**
         *   Get Country to display Language
         *   only for this Controller
         */

        mv.addObject("lang", languagestr);


        /**
         *   load entities from table
         *   webtextlayout to contoller
         *
         *   inject text from with webtextcomp[0] fist id of table
         */
        mv.addObject("webtextcomp", iServiceIndex.getDcontroller().getPageLanguageText());
        mv.addObject("btcomp", iServiceIndex.getDcontroller().getBootstrapComponents());


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
    public String en()
    {
        return "redirect:/en/";
    }

    @Override
    public String fr()
    {
        return "redirect:/fr/";
    }

    @Override
    public String es()
    {
        return "redirect:/es/";
    }

    @Override
    public String it()
    {
        return "redirect:/it/";
    }

    @Override
    public String tr()
    {
        return "redirect:/tr/";
    }

    @Override
    public String lpagewebbuilder()
    {
        return "redirect:/lpagewebbuilder/";
    }



}
