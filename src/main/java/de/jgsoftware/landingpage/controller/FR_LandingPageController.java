package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iFR_Controller;
import de.jgsoftware.landingpage.service.interfaces.ifr_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class FR_LandingPageController implements iFR_Controller
{


    ModelAndView mv;
    @Autowired
    ifr_service intfr_serive;


    // load default landingpage
    @Override
    public ModelAndView fr() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        mv = new ModelAndView("fr");


        // load bootstrap components with text to MVC Controller
        mv.addObject("webtextcomp", intfr_serive.getI_dao_fr().getPageLanguageText());
        mv.addObject("btcomp", intfr_serive.getI_dao_fr().getBootstrapComponents());

        return mv;
    }
}
