
public class ConditionalOperator3 {
	public int sum(int a, int b, int c) {
		int result = a+b+c;
		if (a>0 && b>0 && c<=0) {
			result = a+b;
		}
		else if (a>0 && b<=0 && c>0) {
			result = a+c;
		}
		else if (a<=0 && b>0 && c>0) {
			result = b+c;
		}
		else if (a>0 && b<=0 && c<=0) {
			result = a;
		}
		else if (a<=0 && b>0 && c<=0) {
			result = b;
		}
		else if (a<=0 && b<=0 && c>0) {
			result = c;
		}
		else if (a<=0 && b<=0 && c<=0) {
			result = 0;
		}
		return result;
	}
	public static void main(String[] args) {
		ConditionalOperator3 numbers = new ConditionalOperator3();
		int suma = numbers.sum(4, -3, 5);
		System.out.println("Result = " + suma);
	}

}
