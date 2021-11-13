import static org.junit.Assert.*;

import org.junit.Test;

public class Function2Test {

	@Test
	public void testSquare() {
		Function2 numbers = new Function2();
		int actual = numbers.square(3);
		int expected = 9;
		assertEquals(actual, expected);
	}

	@Test
	public void testFunctionLengthBetweenPoints() {
		Function2 numbers = new Function2();
		Object actual = numbers.FunctionLengthBetweenPoints(new int[] {9, 6}, new int[] {5, 3});
		Object expected = 5.0;
		assertEquals(expected, actual);
	}

}
