package com.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// store in memory
		// UserBuilder users = User.withDefaultPasswordEncoder();
		// auth.inMemoryAuthentication()
		//	.withUser(users.username("john").password("test123").roles("EMPLOYEE"))
		//	.withUser(users.username("mary").password("test123").roles("EMPLOYEE", "MANAGER"))
		//	.withUser(users.username("susan").password("test123").roles("EMPLOYEE", "ADMIN"));
		auth.jdbcAuthentication().dataSource(dataSource);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// csrf().disable()
		
		http.authorizeRequests()
		    	.antMatchers("/static/**").permitAll()
		    	.antMatchers("/user/register/**").permitAll()
		    	.antMatchers("/").hasRole("EMPLOYEE")
		    	.antMatchers("/leaders/**").hasRole("MANAGER")
		    	.antMatchers("/system/**").hasRole("ADMIN")
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/login") // default /login GET
				.loginProcessingUrl("/login") // default /login POST
				.permitAll()
			.and()
				.logout().permitAll() // default /logout
			.and()
				.exceptionHandling()
				.accessDeniedPage("/403");
	}
	
}
