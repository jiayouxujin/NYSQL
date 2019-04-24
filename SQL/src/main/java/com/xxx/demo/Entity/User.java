package com.xxx.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    int userID;

    @Column
    String password;

    @Column(name = "user_name",columnDefinition = "char(200) character set utf8")
    String username;

    @Column
    Date registerday;

    public User() { }

    public User(String username, String password, Date registerday) {
        this.username = username;
        this.password = password;
        this.registerday = registerday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", registerday=" + registerday +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegisterday() {
        return registerday;
    }

    public void setRegisterday(Date registerday) {
        this.registerday = registerday;
    }
}
