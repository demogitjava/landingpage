package de.jgsoftware.landingpage;

import org.h2.tools.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;


// de.jgsoftware.websitebuilder.DemoWebsitebuilderApplication
@SpringBootApplication
public class DemoLandingPageApplication {




    public DemoLandingPageApplication()
    {

    }




    public static void main(String[] args) {
        SpringApplication.run(DemoLandingPageApplication.class, args);
    }





}
