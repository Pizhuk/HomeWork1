import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperator3Test {

	@Test
	public void testSum() {
		ConditionalOperator3 numbers = new ConditionalOperator3();
		int actual = numbers.sum(4, -3, 5);
		int expected = 9;
		assertEquals(actual, expected);
	}

}
