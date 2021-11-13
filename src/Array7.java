
public class Array7 {
	public int countNechet(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length;i++) {
			if(nums[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Array7 numbers = new Array7();
		int res = numbers.countNechet(new int[] {12, -23, 16, 5, 17, 2});
		System.out.println("Count = " + res);

	}

}
