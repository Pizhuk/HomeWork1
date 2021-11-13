import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperator2Test {

	@Test
	public void testQuarterOfGrafics() {
		ConditionalOperator2 numbers = new ConditionalOperator2();
		int actual = numbers.QuarterOfGrafics(4, 3);
		int expected = 1;
		assertEquals(actual, expected);
	}

}
