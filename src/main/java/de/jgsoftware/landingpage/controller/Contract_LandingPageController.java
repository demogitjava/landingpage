package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iContactController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Contract_LandingPageController implements iContactController
{


    @Override
    public ModelAndView contact()
    {

        ModelAndView mv = new ModelAndView("contact");






        return mv;
    }
}
