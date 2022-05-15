package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAdminController;
import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;


@Controller
public class Admin_Controller implements iAdminController
{


    ModelAndView mv;

    java.util.Locale locale;
    @Autowired
    IServiceIndex iServiceIndex;
    @Autowired
    HttpServletRequest request;


    Principal principal;

    @Override
    public ModelAndView admincontroller()
    {





        return mv;
    }

}
