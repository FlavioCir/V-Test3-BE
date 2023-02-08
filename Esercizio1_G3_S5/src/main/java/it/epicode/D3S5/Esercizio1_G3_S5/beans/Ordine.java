package it.epicode.D3S5.Esercizio1_G3_S5.beans;

import java.time.LocalDate;
import java.util.List;

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
public class Ordine {

	Tavolo tavolo;
	int nOrdine;
	StatoOrdine statoOrdine;
	int coperti;
	LocalDate oraOrdine;
	double importoTotale = 0;
	List<Prodotto> lista;
	
	public Ordine(Tavolo tavolo, int nOrdine, StatoOrdine statoOrdine, int coperti, LocalDate oraOrdine, List<Prodotto> lista) {
		this.tavolo = tavolo;
		this.nOrdine = nOrdine;
		this.statoOrdine = statoOrdine;
		this.coperti = coperti;
		this.oraOrdine = oraOrdine;
		this.lista = lista;
	}
	
	public void getTotale() {
		for(int i = 0; i < lista.size(); i++) {
			importoTotale += lista.get(i).prezzo;
		}
		importoTotale = importoTotale + (coperti * 2);
	}
	
	public void getListaOrdine() {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).nome + lista.get(i).prezzo);
		}
	}

	@Override
	public String toString() {
		return "Ordine: " + this.nOrdine + " | tavolo: " + tavolo.nTavolo + " | prezzo totale: " + getImportoTotale() + " | persone: " + coperti;
	}
	
}
