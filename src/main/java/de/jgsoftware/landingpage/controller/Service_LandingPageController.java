package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iServiceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Service_LandingPageController implements iServiceController
{

    ModelAndView mv;

    @Override
    public ModelAndView service()
    {
        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        mv = new ModelAndView("service");






        return mv;
    }
}
