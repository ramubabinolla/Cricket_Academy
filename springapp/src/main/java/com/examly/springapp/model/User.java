package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String mobileNumber;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean active = true;
    // private String confirmPassword;

    

    public User(Long id, String role, String email, String username, String mobileNumber, String password,
            boolean active) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.active = active;
        // this.confirmPassword = confirmPassword;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public User() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // public String getConfirmPassword() {
    //     return confirmPassword;
    // }
    // public void setConfirmPassword(String confirmPassword) {
    //     this.confirmPassword = confirmPassword;
    // }
    

    @Override
    public String toString() {
        
        return "User [  active=" + active + " email=" + email + ", id=" + id + ", mobileNumber="
                + mobileNumber + ", password=" + password + ", role=" + role + ", username=" + username + "]";
    }
}