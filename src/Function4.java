import java.util.Arrays;
public class Function4 {
	public int FunctionStrToInt(String ANumInStr) {
		String[] words = ANumInStr.split(" ");
		String res = "";
		String[] firstNumbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
		String[] secondNumbers = {"","", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
		String[] thirdNumbers = {"","сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
		String[] numbersFrom10To19 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
		if (words.length==1) {
			res = Integer.toString(Arrays.asList(firstNumbers).indexOf(words[0]));
		}
		else if (words.length==2) {
			for (int i = 0; i < 2; i++) {
				if (i==0) {
					res = Integer.toString(Arrays.asList(secondNumbers).indexOf(words[i]));
				}
				else {
					res = res + Integer.toString(Arrays.asList(firstNumbers).indexOf(words[i]));
				}
			}
		}
		else if (words.length==3) {
			for (int i = 0; i < 3; i++) {
				if (i==0) {
					res = Integer.toString(Arrays.asList(thirdNumbers).indexOf(words[i]));
				}
				else if(i==1) {
					res = res + Integer.toString(Arrays.asList(secondNumbers).indexOf(words[i]));
				}
				else {
					res = res + Integer.toString(Arrays.asList(firstNumbers).indexOf(words[i]));
				}
			}
		}
		
		if (ANumInStr == "десять" || ANumInStr == "одиннадцать" || ANumInStr == "двенадцать" || ANumInStr == "тринадцать" || ANumInStr == "четырнадцать" || ANumInStr == "пятнадцать" || ANumInStr == "шестнадцать" || ANumInStr == "семнадцать" || ANumInStr == "восемнадцать" || ANumInStr == "девятнадцать") {
			res = Integer.toString(Arrays.asList(numbersFrom10To19).indexOf(ANumInStr)+10);
		}
		
		return Integer.parseInt(res);
	}
	public static void main(String[] args) {
		Function4 numbers = new Function4();
		int result = numbers.FunctionStrToInt("пятьдесят шесть");
		System.out.println(result);

	}

}
