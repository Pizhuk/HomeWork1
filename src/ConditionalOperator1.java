

public class ConditionalOperator1 {

	public int IsItEven(int a, int b) {
		int result;
		
		if (a % 2 == 0) {
			result = a*b;
		}
		else {
			result = a+b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ConditionalOperator1 numbers = new ConditionalOperator1();
		int chet = numbers.IsItEven(4, 3);
		System.out.println("Result = " + chet);
	}
}
