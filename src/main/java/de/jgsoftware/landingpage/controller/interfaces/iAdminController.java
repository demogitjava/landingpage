package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public interface iAdminController
{
    @GetMapping({"admin", "/"})
    public ModelAndView demo();
}
