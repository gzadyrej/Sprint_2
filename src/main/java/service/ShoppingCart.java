package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            total = total + item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];

            double priceWithoutDiscount = item.getAmount() * item.getPrice();

            double discount = 0;
            if (item instanceof Discountable) {
                Discountable disc = (Discountable) item;
                discount = disc.getDiscount();
            }

            double priceWithDiscount = priceWithoutDiscount * (1 - discount);
            total = total + priceWithDiscount;
        }
        return total;
    }

    public double getVegetarianTotal() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            if (item.isVegetarian()) {
                total = total + item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
