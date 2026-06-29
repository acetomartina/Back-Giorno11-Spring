package martinaaceto.Back_Giorno11_Spring;

import martinaaceto.Back_Giorno11_Spring.model.Menu;
import martinaaceto.Back_Giorno11_Spring.model.Pizza;
import martinaaceto.Back_Giorno11_Spring.model.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackGiorno11SpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(BackGiorno11SpringApplication.class, args);

		Menu menu = context.getBean(Menu.class);
		System.out.println(menu);

		System.out.println("\nPersonalizza la tua pizza!");

		Pizza margherita = context.getBean("margherita", Pizza.class);
		Topping funghi = context.getBean("funghi", Topping.class);
		Topping prosciutto = context.getBean("prosciuttoCotto", Topping.class);

		margherita.aggiungiTopping(funghi);
		margherita.aggiungiTopping(funghi);
		margherita.aggiungiTopping(prosciutto);

		System.out.println(margherita);

		context.close();
	}
}