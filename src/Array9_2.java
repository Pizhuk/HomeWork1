import java.util.Arrays;

public class Array9_2 {
	public int[] sortMassiv2(int[] nums) {
		for (int i = 0; i < nums.length; i++) {    
            int pos = i;
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    pos = j;    
                    min = nums[j];
                }
            }
            nums[pos] = nums[i];
            nums[i] = min; 
        }
		return nums;
	}
	public static void main(String[] args) {
		Array9_2 numbers = new Array9_2();
		int[] res = numbers.sortMassiv2(new int[] {12, 23, 16, 5, 17, 2});
		System.out.println("Sorted massiv = " + Arrays.toString(res));

	}

}
