package de.jgsoftware.landingpage.controller.interfaces.mobile;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/m_fr")
public interface i_mobile_fr
{
    @GetMapping({"m_fr", "/"})
    ModelAndView m_fr();
}
