package org.formation.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class notiCalculatorTest {
	Calculator calcul = new notiCalculator();

	@Test
	public void add_should_return_expected() {
//		assertTrue(calcul.add(2, 2) == 4);
//		assertTrue(calcul.add(28, 62) == 90);
//		assertTrue(calcul.add(65, 165) == 230);
//		assertFalse(calcul.add(1, 6) == 8);
		int expected = 30;
		assertEquals(expected, calcul.add(10, 20));
	}

}
