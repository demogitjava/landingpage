package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 * @author hoscho
 */
@RequestMapping("/")
public interface iDemoController {



    // load default landingpage
    // de
    @GetMapping({"de", "/"})
    ModelAndView de() throws IOException;

    @GetMapping("/login")
    String login();

    @GetMapping("/header")
    String header();

    @GetMapping("/en")
    String en();

    @GetMapping("/fr")
    String fr();

    @GetMapping("/es")
    String es();

    @GetMapping("/it")
    String it();

    @GetMapping("/tr")
    String tr();

    @GetMapping("/lpagewebbuilder")
    String lpagewebbuilder();


    @GetMapping("/contact")
    String contact();

    @GetMapping("/about")
    String about();

    @GetMapping("/service")
    String service();

    @GetMapping("/admin")
    String admin();


    @GetMapping("/wiki")
    String wiki();



    /*

            mobile
     */

    @GetMapping("/m_de")
    String m_de();



    /*

            tablet

     */
}
