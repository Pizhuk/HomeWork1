
public class Cycle6 {
	public String Mirrow(int x) {
		String result = "";
		String AStringOfX = Integer.toString(x);
		for (int i = 0; i<AStringOfX.length(); i++) {
			result = result + Integer.toString(x%10);
			x = x/10;
		}
		return result;
	}
	public static void main(String[] args) {
		Cycle6 numbers = new Cycle6();
		String mirrownum = numbers.Mirrow(9274);
		System.out.println("Result: " + mirrownum);
	}

}
