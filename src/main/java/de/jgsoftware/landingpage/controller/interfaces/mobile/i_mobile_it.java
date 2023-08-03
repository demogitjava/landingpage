package de.jgsoftware.landingpage.controller.interfaces.mobile;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author hoscho
 */
@RequestMapping("/m_it")
public interface i_mobile_it
{
    @GetMapping({"m_it", "/"})
    ModelAndView m_it();
}
