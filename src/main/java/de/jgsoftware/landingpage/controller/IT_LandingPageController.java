package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iIT_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IT_LandingPageController implements iIT_Controller
{

    // load default landingpage
    @Override
    public ModelAndView it() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("it");


        return mv;
    }
}
