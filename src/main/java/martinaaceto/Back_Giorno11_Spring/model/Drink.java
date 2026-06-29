package martinaaceto.Back_Giorno11_Spring.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Drink extends MenuItem {

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return """
                %s
                  Prezzo: € %.2f
                  Calorie: %d
                """.formatted(
                getName(),
                getPrice(),
                getCalories()
        );
    }
}