import static org.junit.Assert.*;

import org.junit.Test;

public class Function4Test {

	@Test
	public void testFunctionStrToInt() {
		Function4 numbers = new Function4();
		int actual = numbers.FunctionStrToInt("четыреста сорок один");
		int expected = 441;
		assertEquals(actual, expected);
	}

}
