package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.dao.Dao_admin;
import de.jgsoftware.landingpage.dao.interfaces.i_jpa_useragent;
import de.jgsoftware.landingpage.service.interfaces.i_admin_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class admin_service implements i_admin_service
{


    // interface hibernate jpa
    @Autowired
    i_jpa_useragent iJpaUseragent;


    @Override
    public i_jpa_useragent getiJpaUseragent() {
        return iJpaUseragent;
    }

    @Override
    public void setiJpaUseragent(i_jpa_useragent iJpaUseragent) {
        this.iJpaUseragent = iJpaUseragent;
    }

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


        ZonedDateTime ztime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
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



}
