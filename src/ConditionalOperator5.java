
public class ConditionalOperator5 {
	public char Grade(int x) {
		char result;
		if (x>=0 && x<=19) {
			result = 'F';
		}
		else if (x>=20 && x<=39) {
			result = 'E';
		}
		else if (x>=40 && x<=59) {
			result = 'D';
		}
		else if (x>=60 && x<=74) {
			result = 'C';
		}
		else if (x>=75 && x<=89) {
			result = 'B';
		}
		else if (x>=90 && x<=100) {
			result = 'A';
		}
		else {
			result = '-';
		}
		return result;
	}
	public static void main(String[] args) {
		ConditionalOperator5 numbers = new ConditionalOperator5();
		char grade = numbers.Grade(17);
		System.out.println("Grade is " + grade);
	}

}
