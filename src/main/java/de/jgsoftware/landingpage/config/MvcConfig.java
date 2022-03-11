package de.jgsoftware.landingpage.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer
{

    @Autowired
    public AppConfigLocale appConfigLocale;


    public void addViewControllers(ViewControllerRegistry registry)
    {

        //registry.addViewController("/").setViewName("de");
        /*

        registry.addViewController("/es/").setViewName("es");
        registry.addViewController("/fr/").setViewName("fr");
        registry.addViewController("/it/").setViewName("it");
        registry.addViewController("/tr/").setViewName("tr");
        */
        registry.addViewController("/").setViewName("index");


        /*
            register languages to controller
         */
        registry.addViewController("/en").setViewName("en");
        registry.addViewController("/fr").setViewName("fr");
        registry.addViewController("/es").setViewName("es");
        registry.addViewController("/it").setViewName("it");
        registry.addViewController("/tr").setViewName("tr");

        registry.addViewController("/lpagewebbuilder").setViewName("lpagewebbuilder");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/userlogin").setViewName("login");

        registry.addViewController("/service").setViewName("service");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/contact").setViewName("contact");

    }

    public AppConfigLocale getAppConfigLocale() {
        return appConfigLocale;
    }
    public void setAppConfigLocale(AppConfigLocale appConfigLocale) {
        this.appConfigLocale = appConfigLocale;
    }
}