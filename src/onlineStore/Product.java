package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class Product{
    //  id,name ,type (ex: clothing, electronics etc),price, color
    private int id;
    private String name;
    private String type;
    private double price;
    private String color;

    public Product(int id, String name, String type, double price, String color) {

        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;

    }

//    public Product() {
//
//    }



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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
