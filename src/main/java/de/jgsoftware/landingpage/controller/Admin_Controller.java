package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAdminController;
import de.jgsoftware.landingpage.model.m_webtextlayout;
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


import de.jgsoftware.landingpage.service.interfaces.i_admin_service;

@Controller
public class Admin_Controller implements iAdminController
{


    ModelAndView mv;

    java.util.Locale locale;


    @Autowired
    i_admin_service admin_service;


    @Autowired
    HttpServletRequest request;


    Principal principal;

    @Override
    public ModelAndView admincontroller()
    {

        /**
         *   Bootstrap VALUES for Navigation Bar
         *   class = navbar // Bootstrap
         */
        mv.addObject("webtextcomp", admin_service.getIdao_admin().getWebtextentriys());

         /*
                return all Objects of table
                webtextlayout to mvc Controller
         */
        mv.addObject("listtemplate", admin_service.getIdao_admin().getPageLanguageText());



        return mv;
    }

    @Override
    public String submitForm(m_webtextlayout webtextlayout) {




        admin_service.getIdao_admin().saveFormModalData(webtextlayout);

        //iServiceIndex.getDcontroller().g
        //idexservice.getDcontroller().saveFormModalData(webtextlayout);
        return "redirect:/";
    }

}
