package com.daniel.servicehi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author: Daniel
 * @Date: 2019/7/29 16:16
 */
@RestController
public class HiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HiController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home() {
        return "hi :"+",i am from port:" +port;
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/hello")
    public String hello (){
        return "Bonjour!";
    }

    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal,
                                             Authentication authentication){

        LOGGER.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        LOGGER.info(oAuth2Authentication.toString());
        LOGGER.info("principal.toString()"+principal.toString());
        LOGGER.info("principal.getName()"+principal.getName());
        LOGGER.info("authentication:"+authentication.getAuthorities().toString());

        return oAuth2Authentication;
    }

}
