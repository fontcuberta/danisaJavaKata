package narrowOrParallel.implementationChange;

import java.util.ArrayList;

public class ShoppingCart {
    // private int price;
    private ArrayList<Price> prices = new ArrayList();

    public void add(Price itemPrice) {
        this.prices.add(itemPrice);
    }

    public Price calculateTotalPrice() {
        int calculatedTotal = this.prices.stream().mapToInt(a -> a.getPrice()).sum();
        Price totalPrice = new Price(calculatedTotal);
        return totalPrice;
        // return price;
    }

    public boolean hasDiscount() {
        return this.calculateTotalPrice().getPrice() >= 100;
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
}
