import static org.junit.Assert.*;

import org.junit.Test;

public class Function3Test {

	@Test
	public void testFunctionIntToString() {
		Function3 numbers = new Function3();
		String actual = numbers.FunctionIntToString(145);
		String expected = "сто сорок пять";
		assertEquals(actual, expected);
	}

}
