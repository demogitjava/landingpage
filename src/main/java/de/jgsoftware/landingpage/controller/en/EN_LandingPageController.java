package de.jgsoftware.landingpage.controller.en;


import de.jgsoftware.landingpage.controller.interfaces.en.iEN_Controller;
import de.jgsoftware.landingpage.service.interfaces.ien_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */

@Controller
public class EN_LandingPageController implements iEN_Controller
{
    ModelAndView mv;

    @Autowired
    ien_service i_service_en;


    // load default landingpage
    @Override
    public ModelAndView en() {


        mv = new ModelAndView("en");

        // load bootstrap components with text to MVC Controller
        mv.addObject("webtextcomp", i_service_en.getiDaoEn().getPageLanguageText());
        mv.addObject("btcomp", i_service_en.getiDaoEn().getBootstrapComponents());


        return mv;
    }
}
