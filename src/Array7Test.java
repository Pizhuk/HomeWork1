import static org.junit.Assert.*;

import org.junit.Test;

public class Array7Test {

	@Test
	public void testCountNechet() {
		Array7 numbers = new Array7();
		int actual = numbers.countNechet(new int[] {12, -23, 16, 5, 17, 2});
		int expected = 3;
		assertEquals(actual, expected);
	}

}
