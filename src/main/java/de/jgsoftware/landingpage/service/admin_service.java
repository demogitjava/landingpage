package de.jgsoftware.landingpage.service;


import static de.jgsoftware.landingpage.DemoLandingPageApplication.st_timezones;
import de.jgsoftware.landingpage.dao.Dao_admin;
import de.jgsoftware.landingpage.service.interfaces.i_admin_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;


/**
 *
 * @author hoscho
 */

@Service
public class admin_service implements i_admin_service
{



    @Autowired
    Dao_admin idao_admin;

    @Override
    public Dao_admin getIdao_admin() {
        return idao_admin;
    }

    @Override
    public void setIdao_admin(Dao_admin idao_admin) {
        this.idao_admin = idao_admin;
    }


    /*
     return current month
  */
    @Override
    public int getcurrentMonth()
    {


        ZonedDateTime ztime = ZonedDateTime.now(ZoneId.of(st_timezones));
        int month = ztime.getMonthValue();

        return month;
    }



    /*
        return current year
     */
    @Override
    public int getcurrentYear()
    {
        ZonedDateTime ztime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        int year = ztime.getYear();
        return year;
    }


    @Override
    public String getloggedinuser()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return currentPrincipalName;
    }


    @Override
    public ScriptEngineManager startjavasciptengine()
    {
        ScriptEngineManager manager = new ScriptEngineManager ();
        ScriptEngine engine = manager.getEngineByName ("js");


        String script = "print ('javascript engine is loaded !')";

        try {


            engine.eval (script);


        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return manager;
    }


    /*

        data for
        Network Activities Graph title sub-title

        --> year is required
            in dao method


     */
    @Override
    public List getconnectdatayear()
    {

       int year = getcurrentYear();
       return idao_admin.connectsnavbargraphicalyear(year);
    }

    @Override
    public Integer addvaluegrafyear(Integer month, Integer intobcount, Integer intlistvalue)
    {

        intlistvalue = intlistvalue + intobcount;
        month = month;


        return month + intobcount;
    }

}
