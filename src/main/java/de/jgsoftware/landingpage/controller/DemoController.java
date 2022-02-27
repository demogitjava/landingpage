package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.service.DemoPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class DemoController
{


    java.util.Locale locale;

    @Autowired
    DemoPageService demoPageService;

    @Autowired
    HttpServletRequest request;

    // load default landingpage
    @GetMapping({"index", "/"})
    public ModelAndView demo() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("demo");




        /**
         *   Get Country to display Language
         *   only for this Controller
         *
         */
        String languagestr = RequestContextUtils.getLocale(request).getLanguage();
        mv.addObject("lang", languagestr);


        /**
         *   Bootstrap VALUES for Navigation Bar
         *   class = navbar // Bootstrap
         */
        mv.addObject("webtextcomp", demoPageService.getDemopreview().getPageNav());


        System.out.print("Der DemoController wurde geladen");

        return mv;
    }

    @PostMapping("/login")
    public String index(String username, String password)
    {

        return "login";
    }



}
