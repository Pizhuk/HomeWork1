
public class Array5 {
	public int getSumOfNechetIndex(int[] nums) {
		int suma = 0;
		for (int i = 1; i < nums.length; i=i+2) {
			suma = suma + nums[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		Array5 numbers = new Array5();
		int res = numbers.getSumOfNechetIndex(new int[] {12, -23, 16, 5, 17, 2});
		System.out.println("Suma = " + res);

	}

}
