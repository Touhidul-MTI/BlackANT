package com.bjit.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String USER = "USER";
	private static final String ADMIN = "ADMIN";

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/", "/home", "/index").permitAll()
		.antMatchers("/allproducts").hasRole(USER)
		.antMatchers("/manageproducts").hasRole(ADMIN).
		and()
		.formLogin().loginPage("/login").failureUrl("/login").permitAll()
		.defaultSuccessUrl("/allproducts", true)
		.and().csrf().disable()
		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");
		
		
		
		
//			.permitAll()
//			.and()
//        .logout()
//			.permitAll()
//			.and()
//        .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
		
		//.csrf().disable()
	//	.defaultSuccessUrl("/success.html", true)
//		.anyRequest().authenticated()
//		http.authorizeRequests()
//		.antMatchers("/admin/**").hasRole("ADMIN")                                      
//		.anyRequest().fullyAuthenticated()
//		.and()
//		.formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
//		.and()
//		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");
		
		/// .httpBasic()                      // it indicate basic authentication is requires
		// .anyRequest().authenticated();    // it's indicate all request will be secure
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user@gmail.com").password("pass").roles(USER).
		and().
		withUser("adm").password("adm").roles(USER, ADMIN);
	}
}
