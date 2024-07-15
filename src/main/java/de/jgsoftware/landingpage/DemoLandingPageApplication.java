package de.jgsoftware.landingpage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
// de.jgsoftware.websitebuilder.DemoWebsitebuilderApplication

import java.util.logging.Level;
import java.util.logging.Logger;

import de.jgsoftware.landingpage.NtpClient1;
import de.jgsoftware.landingpage.NtpClient2;
import de.jgsoftware.landingpage.NtpClient3;

/**
 *
 * @author hoscho
 */
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "de.jgsoftware.landingpage.dao.interfaces.*") 
@EnableTransactionManagement
public class DemoLandingPageApplication 
{
   
    // java -jar h2-1.4.199.jar -webAllowOthers -tcpAllowOthers


    //@Override
    //public static void main(String[] args) {
    //  SpringApplication.run(DemoLandingPageApplication.class, args);
    // }
    public static String st_timezones = "Europe/Berlin";
    public static String operationsytem = null;

    public static void main(String[] args)
    {
        try {
            // 0.openwrt.pool.ntp.org
            NtpClient1 ntpclient = new NtpClient1();
            
            // 1.openwrt.pool.ntp.org
            NtpClient2 ntpclient1 = new NtpClient2();
            
            // 2.openwrt.pool.ntp.org
            NtpClient3 ntpclient2 = new NtpClient3();
            
            // 3.openwrt.pool.ntp.org
            NtpClient4 ntpclient3 = new NtpClient4();

           
            
        } catch (Exception ex) {
            Logger.getLogger(DemoLandingPageApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(st_timezones));
        //ZonedDateTime now = ZonedDateTime.now();

        // set up to UTC
        now.withZoneSameInstant( ZoneId.of("Europe/Berlin") )
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

     


      
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoLandingPageApplication.class);
        builder
                // none
                // reactive
                // servlet
               .web(WebApplicationType.SERVLET)
               .headless(true).run();
       // builder.run(args);

       
        //SpringApplication.run(DemoLandingPageApplication.class, args);
    }

}
