package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import de.jgsoftware.landingpage.controller.interfaces.i_de_wiki;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class de_wiki implements i_de_wiki
{

    java.util.Locale locale;
    @Autowired
    IServiceIndex iServiceIndex;
    @Autowired
    HttpServletRequest request;


    Principal principal;
    @Override
    public ModelAndView wiki()
    {




        ModelAndView mv = new ModelAndView("wiki");



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
        mv.addObject("btcomp", iServiceIndex.getDcontroller().getBootstrapComponents());

        return mv;
    }
}
