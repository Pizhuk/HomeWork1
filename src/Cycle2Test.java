import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle2Test {

	@Test
	public void testPrimeOrNot() {
		Cycle2 numbers = new Cycle2();
		boolean actual = numbers.PrimeOrNot(71);
		boolean expected = true;
		assertEquals(actual, expected);
	}

}
