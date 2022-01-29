package com.example.lecture26listviewwithintent;

class Data {

    String name, des;
    int image;

    public Data(String name, String des, int image) {
        this.name = name;
        this.des = des;
        this.image = image;
    }

    public Data(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

