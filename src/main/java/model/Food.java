package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount; //amount — количество продукта в килограммах (целое число);
    protected double price; //price — цена за единицу (вещественное число);
    protected boolean isVegetarian;//isVegetarian — флаг, который показывает, вегетарианский ли продукт.

    public Food (int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public double getDiscount(){
        return Discount.DEFAULT;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean getVegetarian() {
        return isVegetarian;
    }

    public double totalPrice(){
        return price*amount;
    }

    public double discountPrice(){
        return totalPrice()*(1-getDiscount());
    }
}