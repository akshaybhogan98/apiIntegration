package com.example.api_integration.auth;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class RequestHeaderAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String authClientId = String.valueOf(authentication.getPrincipal());
        String authClientSecret =String.valueOf(authentication.getCredentials());

        if(authClientSecret.equals("null")) {
            log.error("Client-Secret not passed in Header");
            throw new BadCredentialsException("Client-Secret not passed in Header!");
        }

        return new PreAuthenticatedAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), new ArrayList<>());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(PreAuthenticatedAuthenticationToken.class);
    }
}
