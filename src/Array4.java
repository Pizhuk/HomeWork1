
public class Array4 {
	public int findMaximumIndex(int[] nums) {
		int max = nums[0];
		for (int i = 1; i<nums.length; i++) {
			if (max<=nums[i]) {
				max = nums[i];
			}
		}
		
		int index = 0;
		for (int i = 1; i<nums.length; i++) {
			if (nums[i] == max) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Array4 numbers = new Array4();
		int res = numbers.findMaximumIndex(new int[] {23, 45, 112, 18, 24});
		System.out.println("Index of maximum element is "+res);

	}

}
