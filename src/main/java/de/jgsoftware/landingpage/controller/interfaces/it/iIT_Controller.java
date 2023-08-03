package de.jgsoftware.landingpage.controller.interfaces.it;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */

@RequestMapping("/it")
public interface iIT_Controller
{
    @GetMapping({"it", "/"})
    ModelAndView it();
}
