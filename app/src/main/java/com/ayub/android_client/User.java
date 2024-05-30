package com.ayub.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String NIK;
    private String NIM;
    public User(String name, String email, String NIK, String NIM) {
        this.name = name;
        this.email = email;
        this.NIK = NIK;
        this.NIM = NIM;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getNik() { return NIK; }
    public String getNim() { return NIM; }
}