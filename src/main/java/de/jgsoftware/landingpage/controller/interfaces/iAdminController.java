package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import de.jgsoftware.landingpage.model.m_webtextlayout;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
public interface iAdminController
{

    @GetMapping({"admin", "/"})
    public ModelAndView adminsite();

    @PostMapping("/edit/crudlist")
    public String submitForm(m_webtextlayout webtextlayout);



}
