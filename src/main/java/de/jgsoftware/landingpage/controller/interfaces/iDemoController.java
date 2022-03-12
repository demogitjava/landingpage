package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/")
public interface iDemoController {

    // load default landingpage
    // de
    @GetMapping({"index", "/"})
    public ModelAndView index();



    @GetMapping("/login")
    String login();

    @GetMapping("/header")
    public String header();

    @GetMapping("/en")
    public String en();

    @GetMapping("/fr")
    public String fr();

    @GetMapping("/es")
    public String es();

    @GetMapping("/it")
    public String it();

    @GetMapping("/tr")
    public String tr();

    @GetMapping("/lpagewebbuilder")
    public String lpagewebbuilder();


}
