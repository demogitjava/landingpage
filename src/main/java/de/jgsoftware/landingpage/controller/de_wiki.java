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
    HttpServletRequest request;

    ModelAndView mv;

    Principal principal;
    @Override
    public ModelAndView wiki()
    {




        mv = new ModelAndView("wiki");


        /*
                language from useragent
         */
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();

        mv.addObject("lang", languagestr);


        return mv;
    }
}
