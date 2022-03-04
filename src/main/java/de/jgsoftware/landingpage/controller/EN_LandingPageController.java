package de.jgsoftware.landingpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/en")
public class EN_LandingPageController
{

    // load default landingpage
    @GetMapping({"en", "/"})
    public ModelAndView fr() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("en");


        return mv;
    }
}
