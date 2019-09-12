//package io.hashimati.jwtexample.domains;
//
//
//import io.micronaut.core.annotation.Creator;
//import io.micronaut.data.annotation.GeneratedValue;
//import io.micronaut.data.annotation.MappedEntity;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "users_roles")
//public class UsersRoles {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String username;
//    private String role;
//
//
//    public UsersRoles(){}
//
//    public UsersRoles(String username, String role){
//
//        this.username=username;
//        this.role=role;
//    }
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    @Override
//    public String toString() {
//        return "UsersRoles{" +
//                "id=" + id +
//                ", username=" + username +
//                ", role=" + role +
//                '}';
//    }
//}
