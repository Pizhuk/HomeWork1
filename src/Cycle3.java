
public class Cycle3 {
	 public int sqr(int x){
		 long left = 0;
		 long right = x;

		 if(x < 2){
			 return x;
		 }
		 while(left < right){
			 long mid = left + ((right - left) / 2);

		     if(mid * mid == x){
		    	 return (int)mid;

		     }
		     else if(mid * mid < x){
		    	 left = mid + 1;
		     }
		     else{
		    	 right = mid;
		     }
		 }
		 return (int)(left - 1);
	 }
	 
	public static void main(String[] args) {
		Cycle3 number = new Cycle3();
		int sqrt = number.sqr(9);
		System.out.println("Result = " + sqrt);

	}

}
