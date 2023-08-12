package de.jgsoftware.landingpage.controller.interfaces;

import de.jgsoftware.landingpage.model.jpa.demodb.Webtextlayout;
import de.jgsoftware.landingpage.model.jpa.shopdb.m_webtextlayout;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/admin/")
@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
public interface iAdminController
{

    @GetMapping({"admin", "/"})
    ModelAndView admin();

    @PostMapping("/edit/crudlist")
    public String submitForm(Webtextlayout webtextlayout);


    /*
        return data for
        gentelella/navbar
    */
    @GetMapping("/getgraficnavbar")
    @ResponseBody
    List getcondatayear();

    String returntologin();



}
