package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iDemoController;

import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;


//import jakarta.servlet.http.HttpServletRequest;

import java.security.Principal;


import ua_parser.Parser;
import ua_parser.Client;


import java.util.Date;


/**
 *
 * @author hoscho
 */

@Controller
public class DemoController implements iDemoController
{


    java.util.Locale locale;

    @Autowired
    IServiceIndex iServiceIndex;

    @Autowired
    javax.servlet.http.HttpServletRequest request;
    
    ModelAndView mv;

    Principal principal;




    @Override
    public ModelAndView de() {

        
       
     
        // ip address client
        String ipAddress = request.getRemoteAddr();

        String stuseragent = request.getHeader("user-agent");

        Parser uaParser = new Parser();
        Client c = uaParser.parse(stuseragent);

        String stbrowser = c.userAgent.family; // browser
        String stbrowserversion = c.userAgent.family; // browser version
        String stsystem = c.os.family; // operation system

        /*
        System.out.println(c.userAgent.family); // => browser
        System.out.println(c.userAgent.major);  // => browser version
        System.out.println(c.userAgent.minor);  // => "1"

        System.out.println(c.os.family);        // => operation system
           */

        
        // javax.servlet 
        // browser language like "de"
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();

       
        Date date = new Date();

        de.jgsoftware.landingpage.model.jpa.demodb.Useragent muagent = new de.jgsoftware.landingpage.model.jpa.demodb.Useragent();
        muagent.setIpAddress(ipAddress);
        muagent.setStbrowser(stbrowser);
        muagent.setStbrowserversion(stbrowserversion);
        muagent.setStsystem(stsystem);
        muagent.setStlanguage(languagestr);
        muagent.setDatum(date);


        /*
                save pojo
               de.jgsoftware.landingpage.model.useragent
         */
        iServiceIndex.getDcontroller().saveuseragent(muagent);



        /*
                is user loggedin
         */
        principal = request.getUserPrincipal();



        /*

                start spring boot mvc
         */
        mv = new ModelAndView("de");


        /*
                user login
         */
        if(principal == null)
        {
            System.out.print("not login");
        }
        else {
            mv.addObject("lgusername", "User: " + principal.getName());

        }

        /**
         *   Get Country to display Language
         *   only for this Controller
         */

         mv.addObject("lang", languagestr);


        /**
         *   load entities from table
         *   webtextlayout to contoller
         *
         *   inject text from with webtextcomp[0] fist id of table
         */
        mv.addObject("webtextcomp", iServiceIndex.getDcontroller().getPageLanguageText());
       // mv.addObject("btcomp", iServiceIndex.getDcontroller().getBootstrapComponents());

        return mv;
    }

    @Override
    public String login()
    {
        return "login";
    }

    @Override
    public String header()
    {
        return "header";
    }

    @Override
    public String en()
    {
        return "redirect:/en/";
    }

    @Override
    public String fr()
    {
        return "redirect:/fr/";
    }

    @Override
    public String es()
    {
        return "redirect:/es/";
    }

    @Override
    public String it()
    {
        return "redirect:/it/";
    }

    @Override
    public String tr()
    {
        return "redirect:/tr/";
    }

    @Override
    public String lpagewebbuilder()
    {
        return "redirect:/lpagewebbuilder/";
    }


    @Override
    public String contact()
    {
        return "contact";
    }

    @Override
    public String about()
    {
        return "about";
    }

    @Override
    public String service()
    {
        return "service";
    }

    @Override
    public String admin()
    {
        return "redirect:/admin/";
    }

    @Override
    public String wiki()
    {
        return "redirect:/wiki/";
    }

    @Override
    public String m_de()
    {
        return "redirect:/m_de/";
    }



}
