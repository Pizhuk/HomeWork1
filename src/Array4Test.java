import static org.junit.Assert.*;

import org.junit.Test;

public class Array4Test {

	@Test
	public void testFindMaximumIndex() {
		Array4 numbers = new Array4();
		int actual = numbers.findMaximumIndex(new int[] {23, 45, 112, 18, 24});
		int expected = 2;
		assertEquals(actual, expected);
	}

}
