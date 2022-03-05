package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iEN_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/en")
public class EN_LandingPageController implements iEN_Controller
{

    // load default landingpage
    @Override
    public ModelAndView en() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("en");


        return mv;
    }
}
