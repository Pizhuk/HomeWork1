import static org.junit.Assert.*;

import org.junit.Test;

public class Array3Test {

	@Test
	public void testFindMinimumIndex() {
		Array3 numbers = new Array3();
		int actual = numbers.findMinimumIndex(new int[] {23, 45, 112, 18, 24});
		int expected = 3;
		assertEquals(actual, expected);
	}

}
