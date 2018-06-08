package onlineStore;

import java.util.List;

public interface Discount {
    void applyFixedDiscount(Product product);

    void applyPercentageDiscount(Product product);
}
