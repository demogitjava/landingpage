package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAdminController;
import de.jgsoftware.landingpage.model.m_webtextlayout;
import de.jgsoftware.landingpage.service.interfaces.i_admin_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView admin()
    {

        mv = new ModelAndView("admin");


        Integer usercount = admin_service.getIdao_admin().getusercount();
        mv.addObject("usersdb", usercount);

          /*
            get current month and year
            form sercie layer
         */


        int month = admin_service.getcurrentMonth();
        int year = admin_service.getcurrentYear();
        mv.addObject("currentmonth", month);
        mv.addObject("currentyear", year);



        /*
            current connect

            dao interface
            -> i_jpa_useragent

            all connects by month
            -> sql current_date
         */
        mv.addObject("currentconnects", admin_service.getiJpaUseragent().allconnectsbymonth());

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
