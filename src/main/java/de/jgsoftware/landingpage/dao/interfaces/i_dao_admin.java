package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;

public interface i_dao_admin
{

    void saveFormModalData(m_webtextlayout webtextlayout);

    List<m_webtextlayout> getPageLanguageText();

    List<m_webtextlayout> getWebtextentriys();

    Integer getusercount();


    /*
        show connects of the
        current month
     */
    Integer getconnectsmonth();


    // count of users
    // in demodb
    List loadbrowserconnectmonth();


    // count of connects in the month
    // and year
    // --> demodb
    // --> useragent
    List countofyear();
}
