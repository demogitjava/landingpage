package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.AddressException;

@RequestMapping("/about")
public interface iAboutController
{
    @GetMapping({"about", "/"})
    ModelAndView about();



}
