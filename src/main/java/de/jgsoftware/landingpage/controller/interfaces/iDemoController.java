package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/")
public interface iDemoController {

    // load default landingpage
    // de
    @GetMapping({"de", "/"})
    ModelAndView de();

    @GetMapping("/login")
    String login();

    @GetMapping("/header")
    String header();

    @GetMapping("/en")
    String en();

    @GetMapping("/fr")
    String fr();

    @GetMapping("/es")
    String es();

    @GetMapping("/it")
    String it();

    @GetMapping("/tr")
    String tr();

    @GetMapping("/lpagewebbuilder")
    String lpagewebbuilder();


}
