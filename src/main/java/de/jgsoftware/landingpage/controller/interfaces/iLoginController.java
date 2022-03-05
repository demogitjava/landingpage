package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/login")
public interface iLoginController
{
    @GetMapping({"login", "/"})
    public ModelAndView login();

    @GetMapping("/userdata")
    public ModelAndView userdata(String username, String password);
}
