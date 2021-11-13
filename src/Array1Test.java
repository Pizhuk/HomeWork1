import static org.junit.Assert.*;

import org.junit.Test;

public class Array1Test {

	@Test
	public void testMinimum() {
		Array1 numbers = new Array1();
		int actual = numbers.Minimum(new int[] {24, 56, 3, 2});
		int expected = 2;
		assertEquals(actual, expected);
	}

}
