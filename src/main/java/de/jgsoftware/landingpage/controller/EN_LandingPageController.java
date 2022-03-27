package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iEN_Controller;
import de.jgsoftware.landingpage.service.interfaces.i_service_en;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EN_LandingPageController implements iEN_Controller
{
    ModelAndView mv;

    @Autowired
    i_service_en i_service_en;


    // load default landingpage
    @Override
    public ModelAndView en() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        mv = new ModelAndView("en");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", i_service_en.getiDaoEn().getPageLanguageText());
        mv.addObject("btcomp", i_service_en.getiDaoEn().getBootstrapComponents());


        return mv;
    }
}
