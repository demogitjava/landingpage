package de.jgsoftware.landingpage.config;


import com.zaxxer.hikari.HikariConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;


/**
 *
 * @author hoscho
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "de.jgsoftware.landingpage.dao.interfaces",
        entityManagerFactoryRef = "shopEntityManagerFactory",
        transactionManagerRef = "shopTransactionManager")
public class ShopDBConfig extends HikariConfig
{
    //@Autowired
    //@Qualifier(value = "shopJdbcTemplate")
    //JdbcTemplate jtm2;




    //@Autowired
    //DataSource dataSource2;


    private String startdb;

    DriverManagerDataSource dataSource;


    public ShopDBConfig()
    {

    }


    @Bean("ds3")
    @Qualifier("shopdb")
    @ConfigurationProperties(prefix="app.datasource3")
    public DataSource secondDS(
    @Value("${startdb}") String startdb)
    {

        dataSource = new DriverManagerDataSource();

        switch(startdb) {

            case "h2":
            {
                dataSource.setDriverClassName("org.h2.Driver");
                dataSource.setUrl("jdbc:h2:tcp://0.0.0.0:9092/~/shopdb;AUTO_SERVER=true");
                dataSource.setUsername("admin");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;

            case "derby":
            {
                dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
                dataSource.setUrl("jdbc:derby:/root/derbyshopdb");
                dataSource.setUsername("root");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;
            default:
                break;
        }

        return DataSourceBuilder.create().build();
    }



    @Bean(name = "shopEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean shopEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                           @Qualifier("shopdb") DataSource dataSource2,
                                                                           @Value("${startdb}") String startdb) {
        HashMap<String, Object> properties = new HashMap<>();
        //properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");


        String stpersistence = new String("h2demodb");

        if(startdb.equals("h2")) {
            stpersistence = "h2demodb";
            properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        }
        else if(startdb.equals("derby")) {
            stpersistence = "derbydemodb";
            properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        }
        else if(startdb.equals("mysql")) {
            stpersistence = "mysqldemodb";
        }
        else {
            System.out.print("unknown database startype " + startdb + "\n");
            stpersistence = "h2demodb";
        }

        return builder.dataSource(dataSource2)
        .properties(properties)
        .packages("de.jgsoftware.landingpage.model")
        .persistenceUnit(stpersistence)
        .build();
    }

    @Bean(name = "shopTransactionManager")
    public PlatformTransactionManager shopTransactionManager(
            @Qualifier("shopEntityManagerFactory") EntityManagerFactory shopEntityManagerFactory) {
        return new JpaTransactionManager(shopEntityManagerFactory);
    }

    @Bean(name = "shopJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("ds3") DataSource dataSource2,
                                     @Value("${startdb}") String startdb)
    {

        switch(startdb) {

            case "h2":
            {
                dataSource.setDriverClassName("org.h2.Driver");
                dataSource.setUrl("jdbc:h2:tcp://0.0.0.0:9092/~/shopdb;AUTO_SERVER=true");
                dataSource.setUsername("admin");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;

            case "derby":
            {
                dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
                dataSource.setUrl("jdbc:derby:/root/derbyshopdb");
                dataSource.setUsername("root");
                dataSource.setPassword("jj78mvpr52k1");
            }
            break;
            default:
                break;
        }

        //JdbcTemplate jtm = new JdbcTemplate();


        //jtm.setDataSource(dataSource2);
        //return jtm;
        return new JdbcTemplate(dataSource2);
    }
}
