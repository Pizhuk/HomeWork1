
public class ConditionalOperator2 {
	public int QuarterOfGrafics(int x, int y) {
		int quarter = 0;//�� ����������� �� ����� �� ���������(�.�. ����� �� ����� �� ���� ���� � ����� (0,0)
		
		if (x>0 && y>0) {
			quarter = 1; //1 - ����� ������
		}
		else if (x<0 && y>0) {
			quarter = 2; //2 - ����� ������
		}
		else if (x<0 && y<0) {
			quarter = 3; //3 - ����� ������
		}
		else if (x>0 && y<0) {
			quarter = 4; //4 - �������� ������
		}
		return quarter;
	}
	
	public static void main(String[] args) {
		ConditionalOperator2 numbers = new ConditionalOperator2();
		int res = numbers.QuarterOfGrafics(4, 3);
		System.out.println("The Quarter is " + res);

	}

}
