package model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Topping extends MenuItem {

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }

}