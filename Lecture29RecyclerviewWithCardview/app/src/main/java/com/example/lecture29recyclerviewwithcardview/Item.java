package com.example.lecture29recyclerviewwithcardview;

class Item {
    String name;
    int image;
    String des;

    public Item(String name, int image, String des) {
        this.name = name;
        this.image = image;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
