import java.util.Arrays;

public class Array8 {
	public int[] getPolovina(int[] nums) {
		int[] array = new int[nums.length];
		if (nums.length%2!=0) {
			return null;
		}
		else {
			for (int i = nums.length/2, j = 0; i<nums.length; i++, j++) {
				array[j] = nums[i];
			}
			for (int j = nums.length/2, i = 0; j<nums.length; i++, j++) {
				array[j] = nums[i];
			}
		}
		return array;
	}
	public static void main(String[] args) {
		Array8 numbers = new Array8();
		int[] res = numbers.getPolovina(new int[] {12, 23, 16, 5, 17, 2});
		System.out.println("Polovina = " + Arrays.toString(res));
	}

}
