package de.jgsoftware.landingpage.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.AddressException;

/**
 *
 * @author hoscho
 */

@RequestMapping("/contact")
public interface iContactController
{
    @GetMapping({"contact", "/"})
    ModelAndView contact();

    @PostMapping("/sendmail")
    String sendMail(String message, String name, String email) throws AddressException;
}
