package de.jgsoftware.landingpage.controller.mobile;

import de.jgsoftware.landingpage.model.useragent;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import ua_parser.Client;
import ua_parser.Parser;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Date;

import de.jgsoftware.landingpage.service.interfaces.mobile.i_mobile_service;


/**
 *
 * @author hoscho
 */

@Controller
public class Mobile_DE implements de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_de
{

    @Autowired
    i_mobile_service i_mobile_service;

    ModelAndView mv;



    @Override
    public ModelAndView m_de()
    {
        mv = new ModelAndView("m_de");


        mv.addObject("webtextcomp", i_mobile_service.getDcontroller().getPageLanguageText());
        return mv;
    }

}
