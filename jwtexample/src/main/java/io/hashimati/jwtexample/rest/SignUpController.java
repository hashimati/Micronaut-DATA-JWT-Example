package io.hashimati.jwtexample.rest;

import io.hashimati.jwtexample.domains.User;
import io.hashimati.jwtexample.services.UserService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import javax.inject.Inject;

@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/")

public class SignUpController
{

    @Inject
    private UserService userService;



    @Post(value = "/parent/signup")
    @Produces(MediaType.TEXT_PLAIN)
    public String signUpParent(@Body User user)
    {
        System.out.println("I'received Object ");

       // user.setRole("PARENT");
        user.setRoles("PARENT");
        return userService.saveUser(user).toString();
    }


    @Post("/son/signup")
    @Produces(MediaType.TEXT_PLAIN)
    public String signUpSon(@Body User user)
    {
        //user.setRole("SON");
        user.setRoles("SON");
        return userService.saveUser(user).toString();
    }
}
