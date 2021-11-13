import java.util.Arrays;

public class Array9_3 {
	public int[] sortMassiv3(int[] nums) {
		for (int left = 0; left < nums.length; left++) {
			int value = nums[left];
			int i = left - 1;
			for (; i >= 0; i--) {
				if (value < nums[i]) {
					nums[i + 1] = nums[i];
				} else {
					break;
				}
			}
			nums[i + 1] = value;
		}
		return nums;
	}
	public static void main(String[] args) {
		Array9_3 numbers = new Array9_3();
		int[] res = numbers.sortMassiv3(new int[] {12, 23, 16, 5, 17, 2});
		System.out.println("Sorted massiv = " + Arrays.toString(res));

	}

}
