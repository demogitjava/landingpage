package de.jgsoftware.landingpage.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/wiki")
public interface i_de_wiki
{

    @GetMapping({"wiki", "/"})
    ModelAndView wiki();

}
