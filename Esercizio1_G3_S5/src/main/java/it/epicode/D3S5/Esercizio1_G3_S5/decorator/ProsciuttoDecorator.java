package it.epicode.D3S5.Esercizio1_G3_S5.decorator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.epicode.D3S5.Esercizio1_G3_S5.beans.Pizza;
import it.epicode.D3S5.Esercizio1_G3_S5.beans.Topping;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
@NoArgsConstructor
public class ProsciuttoDecorator extends Topping{

	public ProsciuttoDecorator(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "prosciutto";
		this.calorie = 100;
		this.prezzo = 0.20;

	}
	
	@Override
	public String getNome() {
		return pizza.getNome() + "prosciutto ";
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
