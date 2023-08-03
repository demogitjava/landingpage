package de.jgsoftware.landingpage.controller.interfaces.mobile;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hoscho
 */

@RequestMapping("/m_de")
public interface i_mobile_de {




    @GetMapping({"m_de", "/"})
    ModelAndView m_de();
}
