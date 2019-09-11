package io.hashimati.jwtexample.rest;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import java.security.Principal;

@Controller("/")
public class HomeController {



    @Secured(SecurityRule.IS_AUTHENTICATED)
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    String index(Principal principal) {
        return principal.getName();
    }



    @Secured(SecurityRule.IS_ANONYMOUS)
    @Get("/tt")
    @Produces(MediaType.TEXT_PLAIN)
    String index2() {
        return "hello";
    }
}