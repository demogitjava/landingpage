package de.jgsoftware.landingpage.controller.mobile;


import de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_tr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import de.jgsoftware.landingpage.service.interfaces.mobile.i_tr_mobile_service;


/**
 *
 * @author hoscho
 */
@Controller
public class Mobile_TR implements i_mobile_tr
{

    ModelAndView mv;


    @Autowired
    i_tr_mobile_service iTrMobileSerivce;

    @Override
    public ModelAndView m_tr()
    {
        mv = new ModelAndView("m_tr");
        mv.addObject("webtextcomp", iTrMobileSerivce.getI_dao_tr().getPageLanguageText());

        return mv;
    }
}
