package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/")
public interface iDemoController {

    // load default landingpage
    @GetMapping({"index", "/"})
    ModelAndView demo();

    @GetMapping("/login")
    String login();

    @GetMapping("/header")
    String header();

    @GetMapping("/fr")
    String fr();
}
