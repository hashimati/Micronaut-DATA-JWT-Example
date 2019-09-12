package io.hashimati.jwtexample.security;


import io.hashimati.jwtexample.domains.User;
import io.hashimati.jwtexample.repository.UserRepository;
import io.micronaut.security.authentication.*;
import io.reactivex.Flowable;
import org.reactivestreams.Publisher;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.stream.Collectors;

@Singleton
public class AuthenticationProviderUserPassword implements AuthenticationProvider  {

    @Inject
    private UserRepository userRepository;

    @Override
    public Publisher<AuthenticationResponse> authenticate(AuthenticationRequest authenticationRequest) {
       User user =  userRepository.findUserByUsernameAndPassword(
                authenticationRequest.getIdentity().toString(),
                authenticationRequest.getSecret().toString());
        if ( user !=null ) {
            return Flowable.just(new UserDetails(user.getUsername(),
                    Arrays.asList(user.getRoles()
                            .replace(" ", "")
                            .split(","))));
        }
        return Flowable.just(new AuthenticationFailed());
    }
}