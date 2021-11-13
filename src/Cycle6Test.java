import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle6Test {

	@Test
	public void testMirrow() {
		Cycle6 numbers = new Cycle6();
		String actual = numbers.Mirrow(9274);
		String expected = "4729";
		assertEquals(actual, expected);
	}

}
