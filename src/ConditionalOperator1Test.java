import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperator1Test {

	@Test
	public void testIsItEven() {
		ConditionalOperator1 numbers = new ConditionalOperator1();
		int actual = numbers.IsItEven(4, 3);
		int expected = 12;
		assertEquals(actual, expected);
	}

}
