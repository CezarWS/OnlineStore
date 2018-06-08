package onlineStore;

import java.util.List;

public class Store  {
    private String catalog;
    private String product;


    public Store(String catalog,String product, String cartItem){

        this.catalog = catalog;
        this.product = product;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


}
