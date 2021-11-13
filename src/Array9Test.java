

import org.junit.Assert;
import org.junit.Test;

public class Array9Test {

	@Test
	public void testSortMassiv() {
		Array9 numbers = new Array9();
		int[] actual = numbers.sortMassiv(new int[] {12, 23, 16, 5, 17, 2});
		int[] expected = {2, 5, 12, 16, 17, 23};
		Assert.assertArrayEquals(actual, expected);
	}

}
