package com.example.tabok_ui_dev;

public class MhsModel {
    private  String nim, name, email;

    public MhsModel(String name, String nim, String email){
        this.nim = nim;
        this.name = name;
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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
}
