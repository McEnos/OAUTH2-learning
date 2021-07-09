package com.example.jwttokenstore;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(OAuth2Authentication auth2Authentication) {
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) auth2Authentication.getDetails();
        return "Hello! " + details.getDecodedDetails();
    }
}
