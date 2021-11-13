
public class Cycle4 {
	public int Factorial(int n) {
		int result = 1;
		for (int i = 1; i<=n; i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		Cycle4 numbers = new Cycle4();
		int fact = numbers.Factorial(6);
		System.out.println("Factorial "+ 6 +" = " + fact);

	}

}
