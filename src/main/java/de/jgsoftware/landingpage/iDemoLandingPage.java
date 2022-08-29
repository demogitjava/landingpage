package de.jgsoftware.landingpage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
//import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
//@EnableConfigServer
public interface iDemoLandingPage
{
    static void main(String[] args)
    {
        ZonedDateTime now = ZonedDateTime.now();

        // 1. ZonedDateTime to TimeStamp
        Timestamp timestamp = Timestamp.valueOf(now.toLocalDateTime());

        // 2. ZonedDateTime to TimeStamp , no different
        Timestamp timestamp2 = Timestamp.from(now.toInstant());

        System.out.println(now);		// 2019-06-19T14:12:13.585294800+08:00[Asia/Kuala_Lumpur]

        System.out.println(timestamp);	// 2019-06-19 14:12:13.5852948

        System.out.println(timestamp2);
        SpringApplication.run(DemoLandingPageApplication.class, args);
    }
}
