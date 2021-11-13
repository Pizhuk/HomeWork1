import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperator5Test {

	@Test
	public void testGrade() {
		ConditionalOperator5 numbers = new ConditionalOperator5();
		char actual = numbers.Grade(17);
		char expected = 'F';
		assertEquals(actual, expected);
	}

}
