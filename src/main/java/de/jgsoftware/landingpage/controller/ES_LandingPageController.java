package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iES_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ES_LandingPageController implements iES_Controller
{

    // load default landingpage
    @Override
    public ModelAndView es() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("es");


        return mv;
    }
}
