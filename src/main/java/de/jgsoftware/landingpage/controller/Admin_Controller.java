package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iAdminController;
import de.jgsoftware.landingpage.model.dashboardgraphicline;
import de.jgsoftware.landingpage.model.jpa.demodb.Webtextlayout;
import de.jgsoftware.landingpage.service.interfaces.i_admin_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoscho
 */

@Controller
public class Admin_Controller implements iAdminController
{


    /*
        load dashboard
        site over string

     */
    String dashboardhtml;


    java.util.Locale locale;
    ModelAndView mv;


    String language;
    String component;


    @Autowired
    HttpServletRequest request;

    Principal principal;

    @Autowired
    i_admin_service admin_service;


    Integer m01;
    Integer m02;
    Integer m03;
    Integer m04;
    Integer m05;
    Integer m06;
    Integer m07;
    Integer m08;
    Integer m09;
    Integer m10;
    Integer m11;
    Integer m12;

    Integer[] valuemonth;






    /*

        with th:include
        default loading html file
        is
        /dashboard/dashboard1.html
     */

    @Override
    public ModelAndView admin()
    {

        mv = new ModelAndView("admin");


        Integer usercount = admin_service.getIdao_admin().getusercount();
        mv.addObject("usersdb", usercount);

          /*
            get current month and year
            form service layer
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
        mv.addObject("currentconnects", admin_service.getIdao_admin().allconnectsbymonth());


        /*
            connects monat
            for navbar

         */

        Long connetmonth = admin_service.getIdao_admin().connectsmonthnavbar(month, year);
        String stconmonth = connetmonth.toString();
        mv.addObject("connectsnavar", new String(stconmonth));


        /*
            connect year
            for navbar

         */
        Long connectyear = admin_service.getIdao_admin().connectsnavbaryear(admin_service.getcurrentYear());
        String stconyear = connectyear.toString();
        mv.addObject("connectsnavaryear", stconyear);




        /*
            return the user is
            loggedin
         */
        mv.addObject("loggedinuser", admin_service.getloggedinuser());



        /*

            load javascript engine
            over the service layer

         */
       // mv.addObject("javascriptengine", admin_service.startjavasciptengine());


        String dashboardname = "fragments/dashboard1.html";
        mv.addObject("dashboardname", dashboardname);


        /*
                public String
                for loading html
                dashboard site
                in folder
                resources/templates/dashboard
         */
        dashboardhtml = "dashboard/dashboard1";
        mv.addObject("idashboard", dashboardhtml);


        return mv;
    }

    @Override
    public String submitForm(Webtextlayout webtextlayout) {




        admin_service.getIdao_admin().saveFormModalData(webtextlayout);

        //iServiceIndex.getDcontroller().g
        //idexservice.getDcontroller().saveFormModalData(webtextlayout);
        return "redirect:/";

    }

    @Override
    public List getcondatayear()
    {
        List<dashboardgraphicline> connectsyear = null;

         /*
                is user loggedin
         */
        principal = request.getUserPrincipal();


        List graflist = null;

         /*
                user login
         */
        if (principal == null) {
            System.out.print("not login");
            returntologin();
        } else {
            connectsyear = (List<dashboardgraphicline>) admin_service.getconnectdatayear();

            //month day value
            //[1, 1, 23,  1), 17],

            // integer size list
            int indexlist = connectsyear.size();

            graflist = new ArrayList();


            Integer currentyear = admin_service.getcurrentYear();

            m01 = Integer.valueOf(0);
            m02 = Integer.valueOf(0);
            m03 = Integer.valueOf(0);
            m04 = Integer.valueOf(0);
            m05 = Integer.valueOf(0);
            m06 = Integer.valueOf(0);
            m07 = Integer.valueOf(0);
            m08 = Integer.valueOf(0);
            m09 = Integer.valueOf(0);
            m10 = Integer.valueOf(0);
            m11 = Integer.valueOf(0);
            m12 = Integer.valueOf(0);

            valuemonth = new Integer[] {m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12};


            for(int i = 0; i < indexlist; i++) {
                Integer obcount = connectsyear.get(i).getCount();
                Integer obmonth = connectsyear.get(i).getMonat(); // month
                
                Integer obyear = connectsyear.get(i).getJahr(); // year
                //Object obmonth = ((Object[]) connectsyear.get(i))[1]; // month
                //Object obyear = ((Object[]) connectsyear.get(i))[2]; // year

                Integer intmonth = (Integer) obmonth;

                switch (intmonth)
                {
                    case 1:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);
                        Integer intlistvalue = m01;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);



                        m01 = Integer.valueOf(intobcount);
                        break;
                    }
                    case 2:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m02;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m02 = intobcount;
                        break;
                    }

                    case 3:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m03;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m03 = intobcount;
                        break;
                    }

                    case 4:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m03;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);
                        m04 = intobcount;
                        break;
                    }
                    case 5:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m05;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m05 = intobcount;
                        break;
                    }
                    case 6:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m06;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m06 = intobcount;
                        break;
                    }
                    case 7:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m07;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m07 = intobcount;
                        break;
                    }
                    case 8:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m08;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m08 = intobcount;
                        break;
                    }
                    case 9:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m09;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m09 = intobcount;
                        break;
                    }
                    case 10:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);

                        Integer intlistvalue = m10;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m10 = intobcount;
                        break;
                    }
                    case 11:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);


                        Integer intlistvalue = m11;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m11 = intobcount;
                        break;
                    }
                    case 12:
                    {
                        String stobcount = String.valueOf(obcount);
                        Integer intobcount = Integer.valueOf(stobcount);


                        Integer intlistvalue = m12;
                        admin_service.addvaluegrafyear(intmonth, intobcount, intlistvalue);

                        m12 = intobcount;
                        break;
                    }

                    default:
                        break;
                }

               // graflist.add(intmonth, stcount);


            }

            Integer[] countvaluemonth = new Integer[] {m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12};

            graflist.add(countvaluemonth);
        }
        return graflist;
    }


    @Override
    public String returntologin()
    {
        return "redirect:/login/";
    }



}
