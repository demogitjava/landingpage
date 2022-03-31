package de.jgsoftware.landingpage.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/lpagewebbuilder")
public interface iWebSiteBuilder
{
    @GetMapping({"lpagewebbuilder", "/"})
    ModelAndView lpagewebbuilder();

    @PostMapping("/loadhtmlpage")
    String loadhtmlpage(String language, String component);

    @PostMapping("/savehtmlpage")
    String savehtmlpage(String language, String component);


}
