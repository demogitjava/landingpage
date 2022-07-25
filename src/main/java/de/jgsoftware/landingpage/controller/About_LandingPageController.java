package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAboutController;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
public class About_LandingPageController implements iAboutController
{


    java.util.Locale locale;


    IServiceIndex iServiceIndex;


    HttpServletRequest request;

    ModelAndView mv;


    @Override
    public ModelAndView about() {


        mv = new ModelAndView("about");



        String languagestr = RequestContextUtils.getLocale(request).getLanguage();
        mv.addObject("lang", languagestr);




        return mv;
    }
}
