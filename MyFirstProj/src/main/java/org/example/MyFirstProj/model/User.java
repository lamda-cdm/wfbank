package org.example.MyFirstProj.model;

import java.util.UUID;

public class User {
    private UUID uid;
    private int account_no;
    private String username;
    private String password;
    private String pin;

    public UUID getUid() {
        return uid;
    }

    public void setUid() {
        this.uid = UUID.randomUUID();
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public User(int account_no, String username, String password, String pin) {
        setUid();
        this.account_no = account_no;
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

}
