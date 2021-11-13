import static org.junit.Assert.*;

import org.junit.Test;

public class Array5Test {

	@Test
	public void testGetSumOfNechetIndex() {
		Array5 numbers = new Array5();
		int actual = numbers.getSumOfNechetIndex(new int[] {12, -23, 16, 5, 17, 2});
		int expected = -16;
		assertEquals(actual, expected);
	}

}
