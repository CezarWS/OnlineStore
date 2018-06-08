package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class DiscountImpl implements Discount {
    private Product product;
    private int discountPercent ;
    private int discountFixed;


    public DiscountImpl(int discountPercent,int discountFixed) {
        this.discountPercent = discountPercent;
        this.discountFixed = discountFixed;

    }

    public Product getProduct(){
        return product;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }

    public int getDiscountFixed() {
        return discountFixed;
    }



    @Override
    public void applyFixedDiscount(Product product) {
          if (product.getId() == 1){
                product.setPrice(300);
            }
            else {
                System.out.println("Product has no fixed discount");
            }

        }


    @Override
    public void applyPercentageDiscount(Product product) {

            if (product.getId() == 2){
                product.setPrice((250 * 5) / 100);
            }
            else {
                System.out.println("Product has no percentage discount");
            }

        }
    }



