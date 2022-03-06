package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iContactController;
import de.jgsoftware.landingpage.controller.interfaces.iServiceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Contract_LandingPageController implements iContactController
{


    @Override
    public ModelAndView contact()
    {
        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("contact");






        return mv;
    }
}
