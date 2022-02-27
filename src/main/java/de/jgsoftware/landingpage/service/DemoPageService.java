package de.jgsoftware.landingpage.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoPageService
{


    @Autowired
    Dao_DemoPagePreview demopreview;

    public Dao_DemoPagePreview getDemopreview() {
        return demopreview;
    }

    public void setDemopreview(Dao_DemoPagePreview demopreview) {
        this.demopreview = demopreview;
    }
}
