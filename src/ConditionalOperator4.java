
public class ConditionalOperator4 {
	public int SumaOfMaxAnd3(int a, int b, int c) {
		int result;
		if (a*b*c >= a+b+c) {
			result = a*b*c+3;
		}
		else {
			result = a+b+c+3;
		}
		return result;
	}
	public static void main(String[] args) {
		ConditionalOperator4 numbers = new ConditionalOperator4();
		int res = numbers.SumaOfMaxAnd3(5, 6, 0);
		System.out.println("Result = " + res);
	}

}
