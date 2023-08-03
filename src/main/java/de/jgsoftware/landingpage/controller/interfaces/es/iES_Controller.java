package de.jgsoftware.landingpage.controller.interfaces.es;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hoscho
 */
@RequestMapping("/es")
public interface iES_Controller
{
    @GetMapping({"es", "/"})
    ModelAndView es();
}
