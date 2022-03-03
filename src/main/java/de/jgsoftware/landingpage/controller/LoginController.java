package de.jgsoftware.landingpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/login")
public class LoginController
{

    // load default landingpage
    @GetMapping({"login", "/"})
    public ModelAndView demo() {

        ModelAndView mv = new ModelAndView("login");
        
        return mv;
    }

}
