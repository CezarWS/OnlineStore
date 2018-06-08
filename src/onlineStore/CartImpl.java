package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class CartImpl implements ShopCart{
    List<Product> items;

    public CartImpl(){
        items= new ArrayList<Product>();
    }

    @Override
    public void addProduct(Product p) {
        items.add(p);
        }


    @Override
    public void removeProduct(Product p) {
        items.remove(p);
        }

    @Override
    public double computeTotalPrice(Product p) {
        double total = 0;

        for (Product prod: items) {
            if (items.equals("Training")){
                total += 250;
            }
            else if (items.equals("Shoes")){
                total += 450;
            }
            else if (items.equals("T-shirt")){
                total += 60;
            }
            else {
                System.out.println("The product is not on the list");


            }
        }
        return total;
    }

    @Override
    public int getTotalItems() {
        return items.size();
    }

    @Override
    public boolean isContaining(String itemName) {
        return items.contains(itemName);
    }

    @Override
    public void printInvoice() {

    }


}
