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


@Controller
public class Mobile_DE implements de.jgsoftware.landingpage.controller.interfaces.mobile.i_mobile_de
{



    java.util.Locale locale;

    @Autowired
    IServiceIndex iServiceIndex;

    @Autowired
    HttpServletRequest request;
    ModelAndView mv;

    Principal principal;



    @Override
    public ModelAndView m_de()
    {

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

        // browser language like "de"
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();

        Date date = new Date();

        useragent muagent = new useragent();
        muagent.setIpAddress(ipAddress);
        muagent.setStbrowser(stbrowser);
        muagent.setStbrowserversion(stbrowserversion);
        muagent.setStsystem(stsystem);
        muagent.setStlanguage(languagestr);
        muagent.setDate(date);


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
        mv.addObject("btcomp", iServiceIndex.getDcontroller().getBootstrapComponents());


        return mv;
    }

}
