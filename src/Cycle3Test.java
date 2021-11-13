import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle3Test {

	@Test
	public void test() {
		Cycle3 numbers = new Cycle3();
		int actual = numbers.sqr(9);
		int expected = 3;
		assertEquals(actual, expected);
	}

}
