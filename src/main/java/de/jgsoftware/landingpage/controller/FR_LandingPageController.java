package de.jgsoftware.landingpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/fr")
public class FR_LandingPageController
{

    // load default landingpage
    @GetMapping({"fr", "/"})
    public ModelAndView fr() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("fr");





        return mv;
    }
}
