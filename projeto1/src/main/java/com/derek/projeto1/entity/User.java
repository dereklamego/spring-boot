package com.derek.projeto1.entity;
import java.util.Set;
import javax.persistence.*; //asteriscos para importar tudo da jpa
import org.springframework.data.mongodb.core.mapping.Document;

@Document 
public class User {
    @Id 
    private String id;
    private String name;
    private String email;

    @ManyToMany
    private Set<Role> roles;

    public User() {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    

}
