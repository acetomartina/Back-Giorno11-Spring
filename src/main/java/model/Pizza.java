package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Pizza extends MenuItem {

    private List<Topping> toppings;

    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        super(name, price, calories);
        this.toppings = toppings;
    }
}