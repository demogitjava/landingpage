package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iFR_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/fr")
public class FR_LandingPageController implements iFR_Controller
{

    // load default landingpage
    @Override
    public ModelAndView fr() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("fr");


        return mv;
    }
}
