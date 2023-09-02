package edu.ejercicios;

import edu.ejercicios.pizza.base.Pizza;
import edu.ejercicios.pizza.base.Topping;
import edu.ejercicios.pizza.especialidades.PizzaItaliana;
import edu.ejercicios.pizza.interfaces.PizzaBase;

public class Main {
    public static void main (String [] args){

        Pizza pizza = new Pizza("Pizza normarl", 10.00);
        pizza.addTopping(new Topping("Tomate", 20));
        pizza.addTopping(new Topping("Salsa de chile", 30));
        pizza.prepare();
        System.out.println("total: "+ pizza.getPrice());
        PizzaItaliana pizza2= new PizzaItaliana("Pizza italiana", 11.99, "salsa de tomate");
        pizza2.addTopping(new Topping("Tomate", 20));
        pizza2.addTopping(new Topping("Mozzarella", 15));
        pizza2.addTopping(new Topping("Champiñon", 10));
        pizza2.prepare();
        System.out.println("This is the Salsa: ");

        PizzaBase pizza3 = new PizzaBase("Pizza elemental", 9.99);
        pizza3.prepare();

    }

}