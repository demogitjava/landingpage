package de.jgsoftware.landingpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.service.interfaces.iWebBuilderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import de.jgsoftware.landingpage.controller.interfaces.IWebSiteBuilder;

@Controller
public class WebSiteBuilder implements IWebSiteBuilder
{




    @Override
    public ModelAndView webbuilder()
    {
        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("lpagewebbuilder");






        return mv;
    }
}
