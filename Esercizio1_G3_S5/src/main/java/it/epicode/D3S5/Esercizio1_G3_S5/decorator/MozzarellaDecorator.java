package it.epicode.D3S5.Esercizio1_G3_S5.decorator;

import it.epicode.D3S5.Esercizio1_G3_S5.beans.Pizza;
import it.epicode.D3S5.Esercizio1_G3_S5.beans.Topping;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class MozzarellaDecorator extends Topping{

	public MozzarellaDecorator(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "mozzarella";
		this.calorie = 20;
		this.prezzo = 0.10;
	}
	
	@Override
	public String getNome() {
		return pizza.getNome() + "mozzarella ";
	}
	
	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + prezzo;
	}
	
	@Override
	public int getCalorie() {
		return pizza.getCalorie() + calorie;
	}

}