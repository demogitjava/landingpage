package de.jgsoftware.landingpage.controller.mobile;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_fr_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_fr;

@Controller
public class Mobile_FR implements i_mobile_fr
{
    ModelAndView mv;


    @Autowired
    i_fr_mobile_service iFrMobileService;

    @Override
    public ModelAndView m_fr()
    {
        mv = new ModelAndView("m_fr");

        mv.addObject("webtextcomp", iFrMobileService.getI_dao_fr().getPageLanguageText());

        return mv;
    }

}
