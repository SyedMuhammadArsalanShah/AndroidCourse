package com.example.lecture42databasesqlite;

class Contact {
    public int id;
    public String name;
    public String contact  ;


    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public Contact(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public Contact() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
