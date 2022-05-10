package de.jgsoftware.landingpage.controller;


import org.springframework.stereotype.Controller;
import de.jgsoftware.landingpage.controller.interfaces.i_de_wiki;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class de_wiki implements i_de_wiki
{

    ModelAndView mv;

    @Override
    public ModelAndView wiki()
    {

        mv = new ModelAndView("wiki");
        return mv;
    }
}
