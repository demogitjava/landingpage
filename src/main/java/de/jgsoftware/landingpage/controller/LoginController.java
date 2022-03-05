package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iLoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController implements iLoginController
{

    // load default landingpage
    @Override
    public ModelAndView login() {

        //model.addAttribute("lgname", plgservice.getMultipagelanguage().getPageLanguageText());
        //model.addAttribute("productList", indexservice.getDaoProduct().getProductsforLandingpage());
        ModelAndView mv = new ModelAndView("login");


        return mv;
    }



    @Override
    public ModelAndView userdata(String username, String password)
    {
        return new ModelAndView("redirect:/admin");
    }

}
