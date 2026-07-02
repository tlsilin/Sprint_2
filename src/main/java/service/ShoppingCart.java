package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    //получить общую сумму товаров в корзине без скидки,
    public double totalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.totalPrice();
        }
        return total;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double discountPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.discountPrice();
        }
        return total;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double vegPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.getVegetarian())
                total += item.totalPrice();
        }
        return total;
    }
}
