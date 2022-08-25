package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAdminController;
import de.jgsoftware.landingpage.model.Users;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


import de.jgsoftware.landingpage.service.interfaces.i_admin_service;

import java.util.List;

@Controller
public class Admin_Controller implements iAdminController
{


    java.util.Locale locale;
    ModelAndView mv;


    String language;
    String component;


    @Autowired
    i_admin_service admin_service;




    @Override
    public ModelAndView adminsite()
    {

        mv = new ModelAndView("admin");

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
