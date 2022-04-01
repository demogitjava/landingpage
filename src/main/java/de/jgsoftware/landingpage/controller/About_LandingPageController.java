package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAboutController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class About_LandingPageController implements iAboutController
{

    ModelAndView mv;


    @Override
    public ModelAndView about() {


        mv = new ModelAndView("about");






        return mv;
    }
}
