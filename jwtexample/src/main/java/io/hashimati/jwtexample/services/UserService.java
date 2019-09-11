package io.hashimati.jwtexample.services;
import io.hashimati.jwtexample.domains.User;
import io.hashimati.jwtexample.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserService {

    @Inject
    private UserRepository userRepository;

    public User findUserByUsername(String username)
    {
        return userRepository.findUserByUsername(username);

    }
    public User saveUser(User user)
    {
        return userRepository.save(user);

    }

}
