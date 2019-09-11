package io.hashimati.jwtexample.domains;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Objects;


@MappedEntity(value = "systemuser")
public class User
{

    @GeneratedValue
    private long id;

    @Id
    @NotNull
    @Column(name = "username", unique = true, nullable = false, length = 26, updatable = false)
    private String username;


    @NotNull
    @Column(name = "password", nullable = false)
    private String password;


    @OneToMany
    private ArrayList<UsersRoles> roles = new ArrayList<UsersRoles>() ;

    public User(){}
    public User(@NotNull String username, @NotNull String password) {
        this.username = username;
        this.password = password;
//        this.role = role;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public ArrayList<UsersRoles> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<UsersRoles> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
