import org.junit.Assert;
import org.junit.Test;

public class Array8Test {

	@Test
	public void testGetPolovina() {
		Array8 numbers = new Array8();
		int[] actual = numbers.getPolovina(new int[] {12, -23, 16, 5, 17, 2});
		int[] expected = {5, 17, 2, 12, -23, 16};
		Assert.assertArrayEquals(actual, expected);
	}

}
