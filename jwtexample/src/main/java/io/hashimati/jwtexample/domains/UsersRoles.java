package io.hashimati.jwtexample.domains;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity(value = "users_roles")
public class UsersRoles {

    @GeneratedValue
    @Id
    private long id;

    private String username;
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UsersRoles{" +
                "id=" + id +
                ", username=" + username +
                ", role=" + role +
                '}';
    }
}
