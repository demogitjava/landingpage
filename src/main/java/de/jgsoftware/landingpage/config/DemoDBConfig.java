package de.jgsoftware.landingpage.config;


import com.zaxxer.hikari.HikariConfig;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.SQLException;
import java.util.HashMap;

import org.apache.derby.drda.NetworkServerControl;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "de.jgsoftware.landingpage.dao.interfaces",
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager")
public class DemoDBConfig extends HikariConfig
{
    private String startdb;

    DriverManagerDataSource dataSource;

    @Autowired
    public DemoDBConfig(
    @Value("${startdb}") String startdb,
    @Value("${derbystartmode}") String startmode,
    @Value("${derbyipremote}") String derbyipremote)
    {



        this.startdb = startdb;

        switch(startdb) {

            case "h2":
            {

                File f = new File("/root/demodb.mv.db");
                if(f.exists()) {
                System.out.print("root/demodb.mv.db exist" + "\n");
                }
                else {
                    System.out.print("install demodatabase from github - master.zip file ");
                    de.jgsoftware.landingpage.config.shell.shellcommands shellcommands = new de.jgsoftware.landingpage.config.shell.shellcommands();
                    shellcommands.h2demodatabase();
                }


                  startH2Server();
                  break;
            }
            case "derby":
            {
                  File derbyzip = new File("/root/db-derby-10.15.2.0-bin.zip");
                  if(derbyzip.exists()) {
                     System.out.print("derby database exist" + "\n");
                  }
                  else {
                    System.out.print("install derbydb" + "\n");
                      de.jgsoftware.landingpage.config.shell.shellcommands shellcommands = new de.jgsoftware.landingpage.config.shell.shellcommands();
                      shellcommands.derbydemodatabase();
                  }

                  startderbydb(startmode, derbyipremote);
                  break;
            }
            case "mysql":
            {
                 // connect
                 startmysqldb();
                 break;
            }
            default:
            break;
        }

    }

    private void startmysqldb()
    {


    }

    private void startderbydb(
    @Value("${derbystartmode}") String startmode,
    @Value("${derbyipremote}") String derbyipremote)
    {
        /*

              start h2 console
              port 8082
              if
              spring.h2.console.enabled=true

        */
        try {
            Server h2Server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
            org.h2.tools.Server webh2Server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        if(startmode.equals("local"))
        {

            try {

                Runtime.getRuntime().exec("bash export DERBY_HOME=/root/db-derby-10.15.2.0-bin/bin/");
                Runtime.getRuntime().exec("sh /root/db-derby-10.15.2.0-bin/bin/startNetworkServer");

                // CONNECT 'jdbc:derby:firstdb;create=true';
            } catch (IOException e) {
                System.out.print("Error start derby " + e + "\n");
            }
        }
        else if(startmode.equals("remote")) {
            System.out.print("startmode derbydb is remote" + "\n");
        }



    }

    // start h2 database server
    private static void startH2Server()
    {

        try
        {
            org.h2.tools.Server h2Server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
            //org.h2.tools.Server h2Server = Server.createTcpServer().start();
            if (h2Server.isRunning(true))
            {
                System.out.print("H2 server was started and is running." + "\n");
            } else
            {
                h2Server = Server.createTcpServer().start();
                throw new RuntimeException("Could not start H2 server." + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to start H2 server: " + e + "\n");
        }
    }


    @Primary
    @Bean(name = "dataSource")
    @Qualifier("demodb")
    @ConfigurationProperties(prefix = "spring.demodb.datasource")
    public DataSource dataSource(
    @Value("${startdb}") String startdb)
    {
        dataSource = new DriverManagerDataSource();

        switch(startdb) {

            case "h2":
            {
                dataSource.setDriverClassName("org.h2.Driver");
                dataSource.setUrl("jdbc:h2:tcp://0.0.0.0:9092/~/demodb;AUTO_SERVER=true");
                dataSource.setUsername("admin");
                dataSource.setPassword("jj78mvpr52k1");
            }
                break;

            case "derby":
            {
                dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
                dataSource.setUrl("jdbc:derby://0.0.0.0:1527/~/demodb;territory=de_DE;collation=TERRITORY_BASED");
                dataSource.setUsername("root");
                dataSource.setPassword("jj78mvpr52k1");
            }
                    break;
            default:
                    break;
        }



        return DataSourceBuilder.create().build();
    }


    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("demodb") DataSource dataSource,
                                                                       @Value("${startdb}") String startdb) {
        HashMap<String, Object> properties = new HashMap<>();

        String stpersistence = new String("h2demodb");

         if(startdb.equals("h2")) {
           stpersistence = "h2demodb";
           properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
         }
         else if(startdb.equals("derby")) {
           stpersistence = "derbydemodb";
           // org.hibernate.dialect.DerbyDialect
           properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
         }
         else if(startdb.equals("mysql")) {
           stpersistence = "mysqldemodb";
         }
         else {
           System.out.print("unknown database startype " + startdb + "\n");
           stpersistence = "h2demodb";
         }
        return builder.dataSource(dataSource)
        .properties(properties)
        .packages("de.jgsoftware.landingpage.model.jpa.demodb")
        .persistenceUnit(stpersistence)
        .build();

    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory)
    {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Primary
    @Bean(name = "defaultJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("dataSource") DataSource demodb)
    {



        switch(startdb) {

            case "h2":
            {
                dataSource.setDriverClassName("org.h2.Driver");
                dataSource.setUrl("jdbc:h2:tcp://0.0.0.0:9092/~/demodb;AUTO_SERVER=true");
                dataSource.setUsername("admin");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;

            case "derby":
            {
                dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
                dataSource.setUrl("jdbc:derby://0.0.0.0:1527/root/db-derby-10.15.2.0-bin/bin/demodb;territory=de_DE;collation=TERRITORY_BASED");
                dataSource.setUsername("root");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;
            default:
                break;
        }

        JdbcTemplate jtm = new JdbcTemplate();


        jtm.setDataSource(dataSource);
        return jtm;
    }


}
