package de.jgsoftware.landingpage.controller;

import de.jgsoftware.landingpage.controller.interfaces.IWebSiteBuilder;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.controller.interfaces.iAboutController;
import de.jgsoftware.landingpage.controller.interfaces.iServiceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSiteBuilder implements IWebSiteBuilder
{

    @Override
    public ModelAndView webbuilder()
    {
        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("webbuilder");






        return mv;
    }
}
