package de.jgsoftware.landingpage.controller;


import de.jgsoftware.landingpage.controller.interfaces.iWebSiteBuilder;
import de.jgsoftware.landingpage.service.interfaces.iWebBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hoscho
 */


@Controller
public class WebSiteBuilder implements iWebSiteBuilder
{



    java.util.Locale locale;
    ModelAndView mv;

    String htmlcomponent;

    String language;
    String component;


    @Autowired
    iWebBuilderService iWebBuilderService;



    @Override
    public ModelAndView lpagewebbuilder()
    {

        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        mv.addObject("loadedcountry", language);
        mv.addObject("loadedcomp", component);

        return mv;
    }



    @Override
    public String loadhtmlpage(String language, String component)
    {

        this.component = component;
        this.language = language;

        switch(language)
        {
            case "de":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadheader(); // header


                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs(); // contentbody.html

                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadfooter(); // footer

                        break;
                }


                break;
            }
            case "fr":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.frloadheader();

                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.frloadcontent();
                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.frloadfooter();
                        break;
                }

                break;
            }

            case "en":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.enloadheader();

                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.enloadcontent();
                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.enloadfooter();
                        break;
                }

                break;
            }

            case "es":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.esloadheader();
                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.esloadcontent();
                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.esloadfooter();
                        break;
                }

                break;
            }

            case "it":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.itloadheader();

                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.itloadcontent();
                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.itloadfooter();
                        break;
                }

                break;
            }

            case "tr":
            {

                switch (component) {
                    case "header":
                        htmlcomponent = iWebBuilderService.trloadheader();

                        break;
                    case "body":
                        htmlcomponent = iWebBuilderService.trloadcontent();
                        break;
                    case "footer":
                        htmlcomponent = iWebBuilderService.trloadfooter();
                        break;
                }


                break;
            }

            case "--":
            {
                switch (component) {
                    case "about":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadabouthtml();

                        break;
                    case "service":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadservicehtml();
                        break;
                    case "contact":
                        htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loadcontact();
                        break;
                }
            }


            default:
            {
                break;
            }

        }


        return "redirect:/lpagewebbuilder";
    }



    /*

            save html and css data
            as html / css

     */
    @Override
    public String savehtmlcsstofile(
            @RequestParam(value = "gjshtml", required = false) String gjshtml,
            @RequestParam(value = "gjscss", required = false) String gjscss)

    {

        if(language == null && component == null)
        {
           System.out.print("can not save data to file");
        }
        else
        {
            iWebBuilderService.getiDaoWebBuilder().savehtmlandcss(gjshtml, gjscss, language, component);
        }


        return "header data saved";
    }

    @Override
    public ModelAndView loadhtmlabout()
    {


        htmlcomponent = "about.html";
        component = "about.html";
        language = "..";
        htmlcomponent = "about.html";

        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        mv.addObject("loadedcountry", language);
        mv.addObject("loadedcomp", component);

        return mv;
    }

    @Override
    public ModelAndView loadhtmlservice()
    {
        //edit compoent to about.html
        htmlcomponent = "service.html";
        component = "service.html";
        language = "..";
        htmlcomponent = "service.html";

        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        mv.addObject("loadedcountry", language);
        mv.addObject("loadedcomp", component);

        return mv;
    }

    @Override
    public  ModelAndView loadhtmlcontact()
    {
        //edit compoent to about.html
        htmlcomponent = "contact.html";
        component = "contact.html";
        language = "..";
        htmlcomponent = "contact.html";

        if(htmlcomponent == null)
        {
            htmlcomponent = iWebBuilderService.getiDaoWebBuilder().loaddefaultpagetograpesjs();
        }

        mv = new ModelAndView("lpagewebbuilder");

        // load all bootstrap components to MVC Controller
        mv.addObject("webtextcomp", iWebBuilderService.getiDaoWebBuilder().getPageLanguageText());
        mv.addObject("btcomp", iWebBuilderService.getiDaoWebBuilder().getBootstrapComponents());

        mv.addObject("defaultsite", htmlcomponent);

        mv.addObject("loadedcountry", language);
        mv.addObject("loadedcomp", component);

        return mv;
    }


}
