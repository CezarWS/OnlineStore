package onlineStore;

public interface ShopCart {

    void addProduct(Product p);
    void removeProduct(Product p);
    double computeTotalPrice(Product p);
    int getTotalItems();
    boolean isContaining(String itemName);
    void printInvoice();

}
