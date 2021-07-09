package com.example.githubauthorization;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableOAuth2Client
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    /*@Bean
    public ClientRegistrationRepository clientRegistrationRepository(){
        var client = clientRegistration();
        return new InMemoryClientRegistrationRepository(client);
    }*/

   /* private ClientRegistration clientRegistration() {
        return CommonOAuth2Provider.GITHUB
                .getBuilder("github")
                .clientId("d021065349ded5571aea")
                .clientSecret("bf92d5b187a2ed02a4003f7c9c1a094948084e75")
                .build();
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.oauth2Login()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
