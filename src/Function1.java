
public class Function1 {
	public String FunctionWeek(int numOfday) {
		String day = "-";
		if (numOfday==1) {
			day = "Monday";
		}
		else if (numOfday==2) {
			day = "Tuesday";
		}
		else if (numOfday==3) {
			day = "Wednesday";
		}
		else if (numOfday==4) {
			day = "Thursday";
		}
		else if (numOfday==5) {
			day = "Friday";
		}
		else if (numOfday==6) {
			day = "Saturday";
		}
		else if (numOfday==7) {
			day = "Sunday";
		}
		return day;
	}
	public static void main(String[] args) {
		Function1 numbers = new Function1();
		String res = numbers.FunctionWeek(3);
		System.out.println("The day is " + res);
	}

}
