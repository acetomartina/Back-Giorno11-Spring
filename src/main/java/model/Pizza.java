package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Pizza {

    private String name;
    private List<Topping> toppings;

    public Pizza(String name, List<Topping> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    public double getPrice() {
        return toppings.stream()
                .mapToDouble(Topping::getPrice)
                .sum();
    }

    public int getCalories() {
        return toppings.stream()
                .mapToInt(Topping::getCalories)
                .sum();
    }

    public String getToppingsString() {
        return toppings.stream()
                .map(Topping::getName)
                .collect(Collectors.joining(", "));
    }
}