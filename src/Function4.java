import java.util.Arrays;
public class Function4 {
	public int FunctionStrToInt(String ANumInStr) {
		String[] words = ANumInStr.split(" ");
		String res = "";
		String[] firstNumbers = {"����", "����", "���", "���", "������", "����", "�����", "����", "������", "������"};
		String[] secondNumbers = {"","", "��������", "��������", "�����", "���������", "����������", "���������", "�����������", "���������"};
		String[] thirdNumbers = {"","���", "������", "������", "���������", "�������", "��������", "�������", "���������", "���������"};
		String[] numbersFrom10To19 = {"������", "�����������", "����������", "����������", "������������", "����������", "�����������", "����������", "������������", "������������"};
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
		
		if (ANumInStr == "������" || ANumInStr == "�����������" || ANumInStr == "����������" || ANumInStr == "����������" || ANumInStr == "������������" || ANumInStr == "����������" || ANumInStr == "�����������" || ANumInStr == "����������" || ANumInStr == "������������" || ANumInStr == "������������") {
			res = Integer.toString(Arrays.asList(numbersFrom10To19).indexOf(ANumInStr)+10);
		}
		
		return Integer.parseInt(res);
	}
	public static void main(String[] args) {
		Function4 numbers = new Function4();
		int result = numbers.FunctionStrToInt("��������� �����");
		System.out.println(result);

	}

}
