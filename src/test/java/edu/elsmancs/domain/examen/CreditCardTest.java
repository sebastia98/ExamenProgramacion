package edu.elsmancs.domain.examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardTest {

	@Test
	public void test() {
		CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
		assertEquals(abradolph.getNombre(), "Abradolph Lincler");
		assertEquals(abradolph.getNumero(), "4916119711304546");
	}

}
