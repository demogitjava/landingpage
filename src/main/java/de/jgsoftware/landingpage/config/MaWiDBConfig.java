package de.jgsoftware.landingpage.config;


import java.sql.SQLException;
import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

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
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "de.jgsoftware.landingpage.dao.interfaces",
        entityManagerFactoryRef = "mawiEntityManagerFactory",
        transactionManagerRef = "mawiTransactionManager")
public class MaWiDBConfig extends HikariConfig
{
    DriverManagerDataSource dataSource;
    private String startdb;
    //@Autowired
    //@Qualifier(value = "mawiJdbcTemplate")
    //JdbcTemplate jtm1;

    

    //@Autowired
    //DataSource dataSource1;



    public MaWiDBConfig()
    {

    }


    @Bean("ds2")
    @Qualifier("mawidb")
    @ConfigurationProperties(prefix="app.datasource2")
    public DataSource secondDS(@Value("${startdb}") String startdb)
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



    @Bean(name = "mawiEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mawiEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                           @Qualifier("mawidb") DataSource dataSource1,
                                                                           @Value("${startdb}") String startdb) {
        //HashMap<String, Object> properties = new HashMap<>();

        //properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

        String stpersistence = new String("h2demodb");

        if(startdb.equals("h2")) {
            stpersistence = "h2demodb";
        }
        else if(startdb.equals("derby")) {
            stpersistence = "derbydemodb";
        }
        else if(startdb.equals("mysql")) {
            stpersistence = "mysqldemodb";
        }
        else {
            System.out.print("unknown database startype " + startdb + "\n");
            stpersistence = "h2demodb";
        }

        return builder.dataSource(dataSource1)
        //.properties(properties)
                .packages("de.jgsoftware.landingpage.model.jpa.mawi").persistenceUnit(stpersistence).build();
    }

    @Bean(name = "mawiTransactionManager")
    public PlatformTransactionManager mawiTransactionManager(
            @Qualifier("mawiEntityManagerFactory") EntityManagerFactory mawiEntityManagerFactory) {
        return new JpaTransactionManager(mawiEntityManagerFactory);
    }

    @Bean(name = "mawiJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("ds2") DataSource dataSource1,
                                     @Value("${startdb}") String startdb)
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
                dataSource.setUrl("jdbc:derby://0.0.0.0:1527/~/demodb;territory=de_DE;collation=TERRITORY_BASED");
                dataSource.setUsername("root");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;
            default:
                break;
        }

        //JdbcTemplate jtm = new JdbcTemplate();


        //jtm.setDataSource(dataSource1);
        //return jtm;
       return new JdbcTemplate(dataSource1);
    }



}
