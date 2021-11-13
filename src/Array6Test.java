import org.junit.Assert;
import org.junit.Test;

public class Array6Test {

	@Test
	public void testGetMassivNaoborot() {
		Array6 numbers = new Array6();
		int[] actual = numbers.getMassivNaoborot(new int[] {12, -23, 16, 5, 17, 2});
		int[] expected = {2, 17, 5, 16, -23, 12};
		Assert.assertArrayEquals(actual, expected);
	}

}
