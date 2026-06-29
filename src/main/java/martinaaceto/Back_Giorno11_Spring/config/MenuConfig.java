package martinaaceto.Back_Giorno11_Spring.config;

import martinaaceto.Back_Giorno11_Spring.model.Drink;
import martinaaceto.Back_Giorno11_Spring.model.Menu;
import martinaaceto.Back_Giorno11_Spring.model.Pizza;
import martinaaceto.Back_Giorno11_Spring.model.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    // TOPPING

    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", 0.00, 20);
    }

    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.00, 120);
    }

    @Bean
    public Topping prosciuttoCotto() {
        return new Topping("Prosciutto cotto", 1.50, 90);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 1.20, 50);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 1.20, 30);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("Salame piccante", 1.80, 160);
    }

    @Bean
    public Topping olive() {
        return new Topping("Olive", 1.00, 40);
    }

    @Bean
    public Topping wurstel() {
        return new Topping("Würstel", 1.50, 140);
    }

    @Bean
    public Topping patatine() {
        return new Topping("Patatine", 1.50, 180);
    }

    // DRINK

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.50, 150);
    }

    @Bean
    public Drink fanta() {
        return new Drink("Fanta", 2.50, 140);
    }

    @Bean
    public Drink acquaNaturale() {
        return new Drink("Acqua naturale", 1.50, 0);
    }

    @Bean
    public Drink birra() {
        return new Drink("Birra", 4.00, 180);
    }

    // PIZZE

    @Bean
    public Pizza margherita() {
        return new Pizza(
                "Margherita",
                List.of(pomodoro(), mozzarella())
        );
    }

    @Bean
    public Pizza hawaiiana() {
        return new Pizza(
                "Hawaiiana",
                List.of(pomodoro(), mozzarella(), prosciuttoCotto(), ananas())
        );
    }

    @Bean
    public Pizza doppioProsciutto() {
        return new Pizza(
                "Doppio prosciutto",
                List.of(pomodoro(), mozzarella(), prosciuttoCotto(), prosciuttoCotto())
        );
    }

    @Bean
    public Pizza diavola() {
        return new Pizza(
                "Diavola",
                List.of(pomodoro(), mozzarella(), salamePiccante())
        );
    }

    @Bean
    public Pizza capricciosa() {
        return new Pizza(
                "Capricciosa",
                List.of(pomodoro(), mozzarella(), prosciuttoCotto(), funghi(), olive())
        );
    }

    @Bean
    public Pizza americana() {
        return new Pizza(
                "Americana",
                List.of(pomodoro(), mozzarella(), wurstel(), patatine())
        );
    }

    // MENU

    @Bean
    public Menu menu() {
        return new Menu(
                List.of(
                        margherita(),
                        hawaiiana(),
                        doppioProsciutto(),
                        diavola(),
                        capricciosa(),
                        americana()
                ),
                List.of(
                        pomodoro(),
                        mozzarella(),
                        prosciuttoCotto(),
                        ananas(),
                        funghi(),
                        salamePiccante(),
                        olive(),
                        wurstel(),
                        patatine()
                ),
                List.of(
                        cocaCola(),
                        fanta(),
                        acquaNaturale(),
                        birra()
                )
        );
    }
}