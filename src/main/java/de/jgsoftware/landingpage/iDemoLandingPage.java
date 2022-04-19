package de.jgsoftware.landingpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public interface iDemoLandingPage
{


    static void main(String[] args)
    {


        SpringApplication.run(DemoLandingPageApplication.class, args);
    }
}
