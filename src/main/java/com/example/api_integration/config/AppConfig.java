package com.example.api_integration.config;


import com.example.api_integration.auth.RequestHeaderAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter;
import org.springframework.security.web.header.HeaderWriterFilter;

import java.util.Collections;

@Configuration
@EnableWebSecurity
public class AppConfig {
    @Autowired
    RequestHeaderAuthenticationProvider requestHeaderAuthenticationProvider;

    @Value("${auth.id}")
    private String clientId;

    @Value("${auth.secret}")
    private String clientSecret;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .addFilterAfter(requestHeaderAuthenticationFilter(), HeaderWriterFilter.class)
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated();

        return http.build();
    }


    @Bean
    public RequestHeaderAuthenticationFilter requestHeaderAuthenticationFilter() {
        RequestHeaderAuthenticationFilter filter = new RequestHeaderAuthenticationFilter();
        filter.setPrincipalRequestHeader(clientId);
        filter.setCredentialsRequestHeader(clientSecret);
        filter.setExceptionIfHeaderMissing(true);
        filter.setAuthenticationManager(authenticationManager());

        return filter;
    }

    @Bean
    protected AuthenticationManager authenticationManager() {
        return new ProviderManager(Collections.singletonList(requestHeaderAuthenticationProvider));
    }
}
