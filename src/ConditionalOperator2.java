
public class ConditionalOperator2 {
	public int QuarterOfGrafics(int x, int y) {
		int quarter = 0;//не пренадлежит ни одной из четвертей(т.е. лежит на одной из осей либо в точке (0,0)
		
		if (x>0 && y>0) {
			quarter = 1; //1 - перша чверть
		}
		else if (x<0 && y>0) {
			quarter = 2; //2 - друга чверть
		}
		else if (x<0 && y<0) {
			quarter = 3; //3 - третя чверть
		}
		else if (x>0 && y<0) {
			quarter = 4; //4 - четверта чверть
		}
		return quarter;
	}
	
	public static void main(String[] args) {
		ConditionalOperator2 numbers = new ConditionalOperator2();
		int res = numbers.QuarterOfGrafics(4, 3);
		System.out.println("The Quarter is " + res);

	}

}
