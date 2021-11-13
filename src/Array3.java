
public class Array3 {
	public int findMinimumIndex(int[] nums) {
		int min = nums[0];
		for (int i = 1; i<nums.length; i++) {
			if (min>=nums[i]) {
				min = nums[i];
			}
		}
		
		int index = 0;
		for (int i = 1; i<nums.length; i++) {
			if (nums[i] == min) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Array3 numbers = new Array3();
		int res = numbers.findMinimumIndex(new int[] {23, 45, 112, 18, 24});
		System.out.println("Index of minimum element is "+res);

	}

}
