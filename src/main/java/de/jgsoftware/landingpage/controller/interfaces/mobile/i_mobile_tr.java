package de.jgsoftware.landingpage.controller.interfaces.mobile;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/m_tr")
public interface i_mobile_tr {

    @GetMapping({"m_tr", "/"})
    ModelAndView m_tr();
}