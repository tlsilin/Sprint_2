package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private String color;

    public Apple (int amount, double price, String color){
        super(amount, price, true);
        this.color = color;
    }
    @Override
    public double getDiscount(){
        if (Colour.Red.equals(color)){
            return Discount.RED;
        } else {
            return super.getDiscount();
        }
    }
}

/*Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
 Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
 */