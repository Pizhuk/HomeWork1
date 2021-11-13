import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle4Test {

	@Test
	public void testFactorial() {
		Cycle4 numbers = new Cycle4();
		int actual = numbers.Factorial(6);
		int expected = 720;
		assertEquals(actual, expected);
	}

}
