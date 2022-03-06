package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/about")
public interface iAboutController
{
    @GetMapping({"about", "/"})
    public ModelAndView about();


}
