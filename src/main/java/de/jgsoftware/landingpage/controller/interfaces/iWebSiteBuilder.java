package de.jgsoftware.landingpage.controller.interfaces;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@RequestMapping("/lpagewebbuilder")
@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
public interface iWebSiteBuilder
{
    @GetMapping({"lpagewebbuilder", "/"})
    ModelAndView lpagewebbuilder();

    @PostMapping("/loadhtmlpage")
    String loadhtmlpage(String language, String component);


    @RequestMapping("/savehtmlcsstofile")
    @ResponseBody
    String savehtmlcsstofile(
            @RequestParam(value = "gjshtml", required = false) String gjshtml,
            @RequestParam(value = "gjscss", required = false) String gjscss);


    @PostMapping("/loadhtmlabout")
    ModelAndView loadhtmlabout();
    @PostMapping("/loadhtmlservice")
    ModelAndView loadhtmlservice();

    @PostMapping("/loadhtmlcontact")
    ModelAndView loadhtmlcontact();

}
