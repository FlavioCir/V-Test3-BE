package it.epicode.D3S5.Esercizio1_G3_S5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.D3S5.Esercizio1_G3_S5.beans.Pizza;
import it.epicode.D3S5.Esercizio1_G3_S5.beans.Prodotto;
import it.epicode.D3S5.Esercizio1_G3_S5.beans.Topping;
import it.epicode.D3S5.Esercizio1_G3_S5.decorator.MozzarellaDecorator;
import it.epicode.D3S5.Esercizio1_G3_S5.decorator.PomodoroDecorator;

@SpringBootTest
class Esercizio1G3S5ApplicationTests {

	static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	@Test
	void testAddOneItem() {

		ctx.scan("it.epicode.D3S5.Esercizio1_G3_S5.beans");
		ctx.refresh();
		
		Pizza p1 =(Pizza) ctx.getBean(Pizza.class);
		Topping pMargherita = new PomodoroDecorator(new MozzarellaDecorator(p1));
		List<Prodotto> list = new ArrayList<Prodotto>() {{
			add(pMargherita);
		}};

		assertEquals(list.size(), 1);
		
		ctx.close();


	}


	private void assertEquals(int size, int i) {
		// TODO Auto-generated method stub
		
	}

}
