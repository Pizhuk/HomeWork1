import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperator4Test {

	@Test
	public void testSumaOfMaxAnd3() {
		ConditionalOperator4 numbers = new ConditionalOperator4();
		int actual = numbers.SumaOfMaxAnd3(5, 6, 0);
		int expected = 14;
		assertEquals(actual, expected);
	}

}
