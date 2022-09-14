package de.jgsoftware.landingpage.controller.mobile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Mobile_DE implements de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_de
{

    java.util.Locale locale;
    ModelAndView mv;



    @Override
    public ModelAndView m_de()
    {

        return mv;
    }

}
