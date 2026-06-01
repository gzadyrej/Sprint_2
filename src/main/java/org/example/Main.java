package org.example;

import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Мясо: 5 кг по 100 рублей
        Meat meat = new Meat(5, 100);

        // Красные яблоки: 10 кг по 50 рублей
        Apple redApple = new Apple(10, 50, Colour.RED);

        // Зелёные яблоки: 8 кг по 60 рублей
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Массив всех продуктов
        Food[] foods = new Food[3];
        foods[0] = meat;
        foods[1] = redApple;
        foods[2] = greenApple;

        // Корзина
        ShoppingCart cart = new ShoppingCart(foods);

        // Результаты
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotal());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotal());
    }
}
