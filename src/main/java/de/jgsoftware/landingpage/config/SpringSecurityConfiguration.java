package de.jgsoftware.landingpage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter
{



	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private DataSource dataSource;

        
      
	
        
        @Autowired
	public void configAuthentication(AuthenticationManagerBuilder authBuilder) throws Exception {
		authBuilder.jdbcAuthentication()
				.dataSource(dataSource)
				.passwordEncoder(new BCryptPasswordEncoder())
				.authoritiesByUsernameQuery("select username, role from users where username=?")
				.usersByUsernameQuery("select username, password, enabled from users where username=?");

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}



	protected void configure(HttpSecurity http) throws Exception
	{



		http
				.csrf().disable().cors().and()
				.authorizeRequests()
				.antMatchers(

						"index",
						"admin",
						"about",
						"service",
						"contact",
						"wiki",
						//"/h2-console/**",
						"static/**").permitAll()

				//.antMatchers("/profile/**").access("hasRole('ROLE_USER')")
				.antMatchers("lpagewebbuilder").access("hasAuthority('ROLE_ADMIN','ROLE_USER')")
				.antMatchers("admin").access("hasAuthority('ROLE_ADMIN','ROLE_USER')")
				//.antMatchers("/manager/**").access("hasRole('ROLE_MANAGER')")
				.and()
				.formLogin();

				//.rememberMe().tokenValiditySeconds(30000).key("keytoken!")
				//.rememberMeParameter("checkRememberMe");




	}

	//public void configure(WebSecurity web)
	//{
	//	web.ignoring().antMatchers("/");
	//}



}
