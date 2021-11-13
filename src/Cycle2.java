
public class Cycle2 {
	public boolean PrimeOrNot(int x) {
		boolean IsPrime = true;
		for (int i = 2; i<=(x/2); i++) {
			if (x%i == 0) {
				IsPrime = false;
			}
		}
		return IsPrime;
	}
	
	public static void main(String[] args) {
		Cycle2 number = new Cycle2();
		boolean prime = number.PrimeOrNot(71);
		System.out.println("Result = " + prime);

	}
}
