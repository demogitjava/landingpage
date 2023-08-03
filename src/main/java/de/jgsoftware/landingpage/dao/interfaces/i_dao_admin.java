package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;
import javax.sql.DataSource;


/**
 *
 * @author hoscho
 */
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
    
    List allgetBrowserconnects();
    List  allconnectsbymonth();
    //List connectsmonthnavbar(int month, int year);
    //List connectsnavbaryear(int year);
    List connectsnavbargraphicalyear(int year);
    
    Long connectsmonthnavbar(int month, int year);
    Long connectsnavbaryear(int year);

}
