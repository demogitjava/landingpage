package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iContactController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.AddressException;

@Controller
public class Contract_LandingPageController implements iContactController
{

    ModelAndView mv;

    @Autowired
    de.jgsoftware.landingpage.service.interfaces.i_contact_service iContactService;


    @Override
    public ModelAndView contact()
    {

        mv = new ModelAndView("contact");






        return mv;
    }

    @Override
    public String sendMail(String stmessage, String name, String email) throws AddressException {


        iContactService.sendEmail(stmessage, name, email);
        return "redirect:/";
    }

}
