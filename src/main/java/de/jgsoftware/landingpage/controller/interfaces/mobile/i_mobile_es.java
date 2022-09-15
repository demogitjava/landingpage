package de.jgsoftware.landingpage.controller.interfaces.mobile;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/m_es")
public interface i_mobile_es
{
    @GetMapping({"m_es", "/"})
    ModelAndView m_es();
}
