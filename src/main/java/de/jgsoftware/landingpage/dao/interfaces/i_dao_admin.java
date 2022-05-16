package de.jgsoftware.landingpage.dao.interfaces;

import de.jgsoftware.landingpage.model.m_webtextlayout;

import java.util.List;

public interface i_dao_admin
{

    void saveFormModalData(m_webtextlayout webtextlayout);

    List<m_webtextlayout> getPageLanguageText();

    List<m_webtextlayout> getWebtextentriys();
}
