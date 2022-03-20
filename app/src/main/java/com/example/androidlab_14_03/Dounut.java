package com.example.androidlab_14_03;

public class Dounut {
    private String name;
    private String des;
    private double price;
    private int image;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Dounut() {
    }

    public Dounut(String name, String des, double price, int image) {
        this.name = name;
        this.des = des;
        this.price = price;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Dounut{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", price=" + price +
                ", image=" + image +
                '}';
    }
}
