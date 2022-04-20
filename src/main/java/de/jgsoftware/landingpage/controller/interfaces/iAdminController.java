package de.jgsoftware.landingpage.controller.interfaces;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/admin")
public interface iAdminController
{
    @GetMapping({"admin", "/"})
    ModelAndView admincontroller();
}
