package de.jgsoftware.landingpage.controller.interfaces.fr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/fr")
public interface iFR_Controller
{
    @GetMapping({"fr", "/"})
    ModelAndView fr();
}
