
public class Cycle1 {
	public int SumaOfChet() {
		int suma = 0;
		for (int i = 0; i<100; i++) {
			if (i%2==0) {
				suma+=i;
			}
			else {
				continue;
			}
		}
		return suma;
	}
	public static void main(String[] args) {
		Cycle1 numbers = new Cycle1();
		int add = numbers.SumaOfChet();
		System.out.println("Suma of chet ot 1 do 99 = " + add);
	}

}
