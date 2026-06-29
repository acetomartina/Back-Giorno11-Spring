package martinaaceto.Back_Giorno11_Spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n**** MENU ****\n");

        sb.append("\nPIZZE\n\n");
        for (Pizza pizza : pizzas) {
            sb.append(pizza).append("\n");
        }

        sb.append("\nBIBITE\n\n");
        for (Drink drink : drinks) {
            sb.append(drink).append("\n");
        }

        sb.append("\nTOPPING DISPONIBILI\n\n");
        for (Topping topping : toppings) {
            sb.append(topping).append("\n");
        }

        return sb.toString();
    }
}