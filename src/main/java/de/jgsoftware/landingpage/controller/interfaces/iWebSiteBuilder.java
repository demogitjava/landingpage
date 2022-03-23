package de.jgsoftware.landingpage.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/lpagewebbuilder")
public interface iWebSiteBuilder
{
    @GetMapping({"lpagewebbuilder", "/"})
    public ModelAndView lpagewebbuilder();

    @PostMapping("/loadhtmlpage")
    public String loadhtmlpage(String language, String component);




}
