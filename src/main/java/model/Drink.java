package model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Drink extends MenuItem {

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

}