import java.util.Arrays;

public class Array6 {
	public int[] getMassivNaoborot(int[] nums) {
		int[] reversed = new int[nums.length];
	    for (int i = 0; i < nums.length; i++) {
	        reversed[i] = nums[nums.length - 1 - i];
	    }
	    return reversed;
	}

	public static void main(String[] args) {
		Array6 numbers = new Array6();
		int[] res = numbers.getMassivNaoborot(new int[] {12, 23, 16, 5, 17, 2});
		System.out.println("Result = " + Arrays.toString(res));

	}

}
