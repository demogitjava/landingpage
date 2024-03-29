package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */
@RequestMapping("/service")
public interface iServiceController
{
    @GetMapping({"service", "/"})
    ModelAndView service();


    @GetMapping("/getclientid")
    String getClientid(String clientid, String channel);

}
