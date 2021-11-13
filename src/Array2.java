
public class Array2 {
	public int Maximum(int[] nums) {
		int max = nums[0];
		for (int i = 1; i<nums.length; i++) {
			if (max<=nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Array2 numbers = new Array2();
		int res = numbers.Maximum(new int[] {24, 56, 3, 2});
		System.out.println("Result = " + res);
		
	}
}
