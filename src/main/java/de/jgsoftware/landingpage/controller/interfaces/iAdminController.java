package de.jgsoftware.landingpage.controller.interfaces;

import de.jgsoftware.landingpage.model.m_webtextlayout;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
public interface iAdminController
{

    @GetMapping({"admin", "/"})
    ModelAndView admin();

    @PostMapping("/edit/crudlist")
    String submitForm(m_webtextlayout webtextlayout);


    @GetMapping("/getgraficnavbar")
    @ResponseBody
    List getcondatayear();


}
