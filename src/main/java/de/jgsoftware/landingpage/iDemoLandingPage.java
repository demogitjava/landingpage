package de.jgsoftware.landingpage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;
//import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
//@EnableConfigServer
public interface iDemoLandingPage
{
    static void main(String[] args)
    {

        SpringApplication.run(DemoLandingPageApplication.class, args);
    }
}
