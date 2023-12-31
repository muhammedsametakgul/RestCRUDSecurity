package com.samet.crudsecurity.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class BookSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){

        return  new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws  Exception{

        http.authorizeHttpRequests(configurer->
                configurer.requestMatchers(HttpMethod.GET,"/api/books").hasRole("STUDENT")
                        .requestMatchers(HttpMethod.GET,"/api/books/**").hasRole("STUDENT")
                        .requestMatchers(HttpMethod.POST,"/api/books").hasRole("TEACHER")
                        .requestMatchers(HttpMethod.PUT,"/api/books").hasRole("TEACHER")
                        .requestMatchers(HttpMethod.DELETE,"/api/books/**").hasRole("ADMIN")
                );


        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
