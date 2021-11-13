
public class Function2 {
	public int square(int a) {
		return a*a;
	}
	
	public double FunctionLengthBetweenPoints(int[] point1, int[] point2) {
		double length = Math.sqrt(square(point1[0]-point2[0]) + square(point1[1]-point2[1]));
		return length;
	}
	public static void main(String[] args) {
		Function2 numbers = new Function2();
		double res = numbers.FunctionLengthBetweenPoints(new int[] {9, 6}, new int[] {5, 3});
		System.out.println("Length = " + res);

	}

}
