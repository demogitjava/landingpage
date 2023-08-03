package de.jgsoftware.landingpage.controller.interfaces.mobile;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */
@RequestMapping("/m_en")
public interface i_mobile_en
{
    @GetMapping({"m_en", "/"})
    ModelAndView m_en();
}
