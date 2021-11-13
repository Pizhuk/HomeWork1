import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle1Test {

	@Test
	public void testSumaOfChet() {
		Cycle1 numbers = new Cycle1();
		int actual = numbers.SumaOfChet();
		int expected = 2450;
		assertEquals(actual, expected);
	}

}
