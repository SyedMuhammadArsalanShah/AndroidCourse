package com.example.lecture43firebase;

class Students {

    String name,email, pass, cont;

    public Students() {
    }

    public Students(String name, String email, String pass, String cont) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.cont = cont;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}
