package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    //Cart: customer, list of products and discounts, support to calculate the total price, option to print the invoice (as a string in console)".
    // The Cart class should support the following methods:
    //* void addProduct(Product p) { … }
    //* void removeProduct(Product p) { … }
    //* double computeTotalPrice() { … }
    List<Product> product;
    private double totalPrice;

    public Cart(){
        product = new ArrayList<Product>();
    }

    public void addProduct(Product p){
        product.add(p);
    }
    public void removeProduct(Product p){
        product.remove(p);
    }
    public double computeTotalPrice(){
        return totalPrice;
    }
}
