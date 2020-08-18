package com.okta.developer.webapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping(value = "/greeting")
    @ResponseBody
    public String getGreeting(@AuthenticationPrincipal OidcUser oidcUser) {
        return "Hello " + oidcUser.getFullName();
    }
}
