package de.jgsoftware.landingpage.controller.mobile;

import de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_en;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_es_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hoscho
 */
@Controller
public class Mobile_ES implements de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_es
{
    ModelAndView mv;

    @Autowired
    i_es_mobile_service i_es_mobile_service;

    @Override
    public ModelAndView m_es()
    {
        mv = new ModelAndView("m_es");

        mv.addObject("webtextcomp", i_es_mobile_service.getI_dao_es().getPageLanguageText());

        return mv;
    }

}
