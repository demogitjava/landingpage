package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iTR_Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.service.interfaces.itr_service;

@Controller
public class TR_LandingPageController implements iTR_Controller
{

    ModelAndView mv;


    @Autowired
    itr_service itrService;



    // load default landingpage
    @Override
    public ModelAndView tr() {


        mv = new ModelAndView("tr");



        // load bootstrap components with text to MVC Controller
        mv.addObject("webtextcomp", itrService.getiDaoTr().getPageLanguageText());
        mv.addObject("btcomp", itrService.getiDaoTr().getBootstrapComponents());


        return mv;
    }
}
