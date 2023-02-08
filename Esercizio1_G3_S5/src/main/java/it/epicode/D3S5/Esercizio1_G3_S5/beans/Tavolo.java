package it.epicode.D3S5.Esercizio1_G3_S5.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Component
public class Tavolo {

	int nTavolo;
	int nCoperti;
	StatoTavolo stato;
	
	@Override
	public String toString() {
		return "Numero tavolo: " + this.nTavolo + " | numero massimo di coperti: " + this.nCoperti + " | stato del tavolo: " + this.stato;
	}
	
}
