package de.jgsoftware.landingpage.controller.mobile;

import de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_en;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_en_mobile_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author hoscho
 */
@Controller
public class Mobile_EN implements de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_en
{
    ModelAndView mv;


    @Autowired
    i_en_mobile_service i_en_mobile_service;

    @Override
    public ModelAndView m_en()
    {
        mv = new ModelAndView("m_en");

        mv.addObject("webtextcomp", i_en_mobile_service.getI_dao_en().getPageLanguageText());
        return mv;
    }

}
