package praktikum;


import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//Мясо в количестве 5 кг по цене 100 рублей за кг;
        var meat = new Meat(5, 100);

//Яблоки красные в количестве 10 кг по цене 50 рублей;
        var redApple = new Apple(10, 50, Colour.Red);

//Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        var greenApple = new Apple(8, 60, Colour.Green);

        Food[] items = {meat, redApple, greenApple};
        var gard = new ShoppingCart(items);

        //получить общую сумму товаров в корзине без скидки,
        System.out.println("Общая сумма товаров в корзине без скидки " + gard.totalPrice());
        //получить общую сумму товаров в корзине со скидкой,
        System.out.println("Общая сумма товаров в корзине co скидки " + gard.discountPrice());
        //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки " + gard.vegPrice());
    }
}
