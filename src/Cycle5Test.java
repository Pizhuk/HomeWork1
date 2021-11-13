import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle5Test {

	@Test
	public void testSumaOfNumbers() {
		Cycle5 numbers = new Cycle5();
		int actual = numbers.SumaOfNumbers(12345);
		int expected = 15;
		assertEquals(actual, expected);
	}

}
