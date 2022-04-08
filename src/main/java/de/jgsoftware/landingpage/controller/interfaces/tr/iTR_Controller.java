package de.jgsoftware.landingpage.controller.interfaces.tr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/tr")
public interface iTR_Controller
{
    @GetMapping({"tr", "/"})
    ModelAndView tr();
}
