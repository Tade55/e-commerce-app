package com.trustang.ecommercemarketplace.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;



@Configuration(proxyBeanMethods=false)
@EnableWebSecurity
public class SecurityConfiguration{

	@Bean
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
			
		//Disable Cross Site Request Forgery
			http.csrf().disable();
			
			//protect end points at /api/<type>/secure
			http.authorizeRequests(configurer->configurer.requestMatchers("/api/datapost/secure/**").authenticated()).oauth2ResourceServer().jwt();
			
			//Add CORS filters
			http.cors();
			
			//Add content negotiation strategy
			http.setSharedObject(ContentNegotiationStrategy.class, new HeaderContentNegotiationStrategy());
			
			//Force a non-empty response body for 401's to make the response friendly
			
			
			return http.build();
	  } 

	
}

