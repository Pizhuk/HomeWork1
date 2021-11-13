import static org.junit.Assert.*;

import org.junit.Test;

public class Array2Test {

	@Test
	public void testMaximum() {
		Array2 numbers = new Array2();
		int actual = numbers.Maximum(new int[] {24, 56, 3, 2});
		int expected = 56;
		assertEquals(actual, expected);
	}

}
