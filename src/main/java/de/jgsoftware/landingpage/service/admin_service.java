package de.jgsoftware.landingpage.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.jgsoftware.landingpage.dao.Dao_admin;
import de.jgsoftware.landingpage.service.interfaces.i_admin_service;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
    public int getcurrentMonth()
    {
        int month;
        GregorianCalendar date = new GregorianCalendar();
        month = date.get(Calendar.MONTH);
        return month;
    }



    /*
        return current year
     */
    public int getcurrentYear()
    {
        int year;
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        return year;
    }



}
