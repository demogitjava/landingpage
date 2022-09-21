package de.jgsoftware.landingpage.controller.mobile;

import de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_it;
import de.jgsoftware.landingpage.service.mobile.it_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Mobile_IT implements i_mobile_it
{

    ModelAndView mv;

    @Autowired
    it_mobile_service itMobileService;

    @Override
    public ModelAndView m_it()
    {
        mv = new ModelAndView("m_it");
        mv.addObject("webtextcomp", itMobileService.getI_dao_it().getPageLanguageText());

        return mv;
    }
}
