package de.jgsoftware.landingpage.controller.interfaces.en;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hoscho
 */
@RequestMapping("/en")
public interface iEN_Controller
{
    @GetMapping({"en", "/"})
    ModelAndView en();


}
