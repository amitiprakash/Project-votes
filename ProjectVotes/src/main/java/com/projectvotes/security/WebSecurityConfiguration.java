package com.projectvotes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean//Used because if password encoder is wired in another class file
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {//not to be used in production 
//		auth.inMemoryAuthentication()  //in memory authentication
//			.passwordEncoder(getPasswordEncoder())
//			.withUser("amiti")
//			.password(getPasswordEncoder().encode("password"))
//			.roles("USER");
		
		//configure database based authentication
		
		auth.userDetailsService(userDetailsService)
			.passwordEncoder(getPasswordEncoder());
	
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.csrf().disable()
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().hasRole("USER").and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/dashboard")
				.permitAll()
				.and()
			.logout()
				.logoutUrl("/logout")
				.permitAll();
	}
}
