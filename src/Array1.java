
public class Array1 {
	public int Minimum(int[] nums) {
		int min = nums[0];
		for (int i = 1; i<nums.length; i++) {
			if (min>=nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Array1 numbers = new Array1();
		int res = numbers.Minimum(new int[] {24, 56, 3, 2});
		System.out.println("Result = " + res);
		
	}

}
