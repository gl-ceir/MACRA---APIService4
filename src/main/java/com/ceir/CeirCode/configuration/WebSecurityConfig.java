//package com.ceir.CeirCode.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.logout.LogoutHandler;
//
//import com.ceir.CeirCode.security.JWTAuthorizationFilter;
//import com.ceir.CeirCode.service.SysParamServiceImpl;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	SysParamServiceImpl configurationService;
//	
//	@Autowired
//	JWTAuthorizationFilter jwtAuthFilter;
//	
//	@Autowired
//	AuthenticationProvider authenticationProvider;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf().disable()
//		.cors().disable()
//        .authorizeRequests()
//        .antMatchers(configurationService.getWhiteAPIList()).permitAll()
//        .anyRequest().authenticated()
//        .and()
//        .sessionManagement()
//        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//        .and()
//        .authenticationProvider(authenticationProvider)
//        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//        .authorizeRequests();
//	}
//}