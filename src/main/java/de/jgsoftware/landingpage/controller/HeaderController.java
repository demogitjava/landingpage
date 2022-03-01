package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.service.interfaces.IServiceIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/header")
public class HeaderController
{


    @Autowired
    IServiceIndex iServiceIndex;

    java.util.Locale locale;


    @Autowired
    HttpServletRequest request;

    // load default landingpage
    @GetMapping({"header", "/"})
    public ModelAndView demo() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("header");




        /**
         *   Get Country to display Language
         *   only for this Controller
         *
         */
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();
        mv.addObject("lang", languagestr);



        System.out.print("Header Controller " + "\n");

        return mv;
    }





}
