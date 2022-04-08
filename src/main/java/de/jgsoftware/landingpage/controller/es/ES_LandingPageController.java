package de.jgsoftware.landingpage.controller.es;


import de.jgsoftware.landingpage.controller.interfaces.es.iES_Controller;
import de.jgsoftware.landingpage.service.interfaces.ies_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ES_LandingPageController implements iES_Controller
{

    @Autowired
    ies_service es_service;

    ModelAndView mv;

    // load default landingpage
    @Override
    public ModelAndView es() {

        mv = new ModelAndView("es");



        /**
         *   load entities from table
         *   webtextlayout to contoller
         *
         *   inject text from with webtextcomp[0] fist id of table
         */
        mv.addObject("webtextcomp", es_service.getI_dao_es().getPageLanguageText());


        mv.addObject("btcomp", es_service.getI_dao_es().getBootstrapComponents());
        return mv;
    }
}
