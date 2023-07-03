package de.jgsoftware.landingpage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
//import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
//@EnableConfigServer
public interface iDemoLandingPage
{


    public static String st_timezones = "Europe/Berlin";
    public static String operationsytem = null;

    static void main(String[] args)
    {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(st_timezones));
        //ZonedDateTime now = ZonedDateTime.now();

        // set up to GMT
        now.withZoneSameInstant( ZoneId.of("UTC") )
                .format( DateTimeFormatter.ISO_OFFSET_DATE_TIME );
        // 1. ZonedDateTime to TimeStamp
        Timestamp timestamp = Timestamp.valueOf(now.toLocalDateTime());

        // 2. ZonedDateTime to TimeStamp , no different
        Timestamp timestamp2 = Timestamp.from(now.toInstant());

        System.out.println(now);
        System.out.println(timestamp);
        System.out.println(timestamp2);


        String operationsytem = System.getProperty("os.name").toLowerCase();
        if (operationsytem.contains("win")){
            //Betriebssystem = Windows
            operationsytem = "Windows";

        }
        else if (operationsytem.contains("osx")){
            //Betriebssystem = OSX von Apple
            operationsytem = "OSX Apple";
        }
        else if (operationsytem.contains("nix") || operationsytem.contains("aix") || operationsytem.contains("nux")){
            //Betriebssystem = Unix bzw. Linux basiert
            operationsytem = "unix-linux";
        }
        System.out.print(operationsytem + "\n");

        SpringApplicationBuilder builder = new SpringApplicationBuilder(iDemoLandingPage.class);
        builder.web(WebApplicationType.SERVLET)
               .headless(true).run();
       // builder.run(args);
        //SpringApplication.run(DemoLandingPageApplication.class, args);
    }
}
