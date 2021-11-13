import java.util.Arrays;

public class Array9 {
	public int[] sortMassiv(int[] nums) {
		boolean Sort = true;
		int x;
		while(Sort) {
			Sort = false;
			for (int i = 0; i < nums.length-1; i++) {
				if(nums[i]>nums[i+1]) {
					Sort = true;
					x = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = x;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		Array9 numbers = new Array9();
		int[] res = numbers.sortMassiv(new int[] {12, 23, 16, 5, 17, 2});
		System.out.println("Sorted massiv = " + Arrays.toString(res));

	}

}
