package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */
@RequestMapping("/userlogin")
public interface iLoginController
{
    @GetMapping({"userlogin", "/"})
    ModelAndView login();

    @GetMapping("/userdata")
    ModelAndView userdata(String username, String password);

}
