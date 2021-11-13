

import org.junit.Assert;
import org.junit.Test;

public class Array9_2Test {

	@Test
	public void testSortMassiv2() {
		Array9_2 numbers = new Array9_2();
		int[] actual = numbers.sortMassiv2(new int[] {12, 23, 16, 5, 17, 2});
		int[] expected = {2, 5, 12, 16, 17, 23};
		Assert.assertArrayEquals(actual, expected);
	}

}
