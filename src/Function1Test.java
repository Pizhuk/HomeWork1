import static org.junit.Assert.*;

import org.junit.Test;

public class Function1Test {

	@Test
	public void testFunctionWeek() {
		Function1 numbers = new Function1();
		String actual = numbers.FunctionWeek(3);
		String expected = "Wednesday";
		assertEquals(actual, expected);
	}

}
