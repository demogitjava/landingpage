package de.jgsoftware.landingpage.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import de.jgsoftware.landingpage.config.AppConfigLocale;

@Configuration
public class MvcConfig implements WebMvcConfigurer
{

    @Autowired
    public AppConfigLocale appConfigLocale;


    public void addViewControllers(ViewControllerRegistry registry)
    {

        registry.addViewController("/lpagewebbuilder").setViewName("lpagewebbuilder");



        /*

            register languages to controller

         */
        registry.addViewController("/de").setViewName("de");
        registry.addViewController("/en").setViewName("en");
        registry.addViewController("/fr").setViewName("fr");
        registry.addViewController("/es").setViewName("es");
        registry.addViewController("/it").setViewName("it");
        registry.addViewController("/tr").setViewName("tr");


        registry.addViewController("/admin").setViewName("admin");

        registry.addViewController("/service").setViewName("service");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/contact").setViewName("contact");

        registry.addViewController("/wiki").setViewName("wiki");

        // mobile
        registry.addViewController("/m_de").setViewName("m_de");
        registry.addViewController("/m_en").setViewName("m_en");
        registry.addViewController("/m_es").setViewName("m_es");
        registry.addViewController("/m_fr").setViewName("m_fr");

    }

    public AppConfigLocale getAppConfigLocale() {
        return appConfigLocale;
    }
    public void setAppConfigLocale(AppConfigLocale appConfigLocale) {
        this.appConfigLocale = appConfigLocale;
    }
}