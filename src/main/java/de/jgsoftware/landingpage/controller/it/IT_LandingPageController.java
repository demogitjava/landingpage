package de.jgsoftware.landingpage.controller.it;


import de.jgsoftware.landingpage.controller.interfaces.it.iIT_Controller;
import de.jgsoftware.landingpage.service.interfaces.iit_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */

@Controller
public class IT_LandingPageController implements iIT_Controller
{

    ModelAndView mv;

    @Autowired
    iit_service it_service;


    // load default landingpage
    @Override
    public ModelAndView it() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        mv = new ModelAndView("it");


        // load bootstrap components with text to MVC Controller
        mv.addObject("webtextcomp", it_service.getI_dao_it().getPageLanguageText());
        mv.addObject("btcomp", it_service.getI_dao_it().getBootstrapComponents());


        return mv;
    }
}
