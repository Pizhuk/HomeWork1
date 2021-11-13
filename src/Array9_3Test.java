
import org.junit.Assert;
import org.junit.Test;

public class Array9_3Test {

	@Test
	public void testSortMassiv3() {
		Array9_3 numbers = new Array9_3();
		int[] actual = numbers.sortMassiv3(new int[] {12, 23, 16, 5, 17, 2});
		int[] expected = {2, 5, 12, 16, 17, 23};
		Assert.assertArrayEquals(actual, expected);
	}

}
