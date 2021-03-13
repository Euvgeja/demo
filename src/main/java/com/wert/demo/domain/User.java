package com.wert.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    private String id;
    private String username;
    private String lastName;
    private String email;
    private String password;


    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
