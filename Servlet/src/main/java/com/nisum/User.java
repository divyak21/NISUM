package com.nisum;

public class User {
    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    private String email;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}