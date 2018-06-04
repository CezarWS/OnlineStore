package onlineStore;

public class Discount extends Product {
//    PercentageDiscount
//    percent: what percentage of the price should be discounted (e.g 4%)
//* FixedDiscount
//* amount: a fixed amount (e.g 35 RON)
    private double percentageDiscount;

    private double fixedDiscount;

    public Discount(int id, String name, String type, double price, String color, double percentageDiscount, double fixedDiscount) {
        super(id, name, type, price, color);
        this.fixedDiscount = fixedDiscount;
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getFixedDiscount() {
        return fixedDiscount;
    }

    public void setFixedDiscount(double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }
}
