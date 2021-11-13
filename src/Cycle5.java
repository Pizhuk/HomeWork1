
public class Cycle5 {
	public int SumaOfNumbers(int x) {
		int result = 0;
		String AStringOfX = Integer.toString(x);
		for (int i = 0; i<=AStringOfX.length(); i++) {
			result+=(x%10);
			x = x/10;
		}
		return result;
	}
	public static void main(String[] args) {
		Cycle5 numbers = new Cycle5();
		int suma = numbers.SumaOfNumbers(12345);
		System.out.println("Result: " + suma);

	}

}
