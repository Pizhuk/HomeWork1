
public class Function3 {
	public String FunctionIntToString(int num) {
		String res = "";
		String aStringOfNum = Integer.toString(num);
		String[] firstNumbers = {"����", "����", "���", "���", "������", "����", "�����", "����", "������", "������"};
		String[] secondNumbers = {"","", "��������", "��������", "�����", "���������", "����������", "���������", "�����������", "���������"};
		String[] thirdNumbers = {"","���", "������", "������", "���������", "�������", "��������", "�������", "���������", "���������"};
		String[] numbersFrom10To19 = {"������", "�����������", "����������", "����������", "������������", "����������", "�����������", "����������", "������������", "������������"};
		if (aStringOfNum.length()==1) {
			res = firstNumbers[aStringOfNum.charAt(0)-'0'];
		}
		else if(aStringOfNum.length()==2) {
			for (int i = 0; i<2; i++) {
				if(i==0) {
					res = secondNumbers[aStringOfNum.charAt(0)-'0'];
				}
				else {
					res = res +" "+ firstNumbers[aStringOfNum.charAt(1)-'0'];
				}
			}	
		}
		else if(aStringOfNum.length()==3) {
			for (int i = 0; i<3; i++) {
				if(i==0) {
					res = thirdNumbers[aStringOfNum.charAt(0)-'0'];
				}
				else if (i==1) {
					res = res +" "+ secondNumbers[aStringOfNum.charAt(1)-'0'];
				}
				else {
					res = res +" "+ firstNumbers[aStringOfNum.charAt(2)-'0'];
				}
			}	
		}
		
		if (num>=10 && num<=19) {
			res = numbersFrom10To19[num-10];
		}
		
		return res;
	}
	public static void main(String[] args) {
		Function3 numbers = new Function3();
		String result = numbers.FunctionIntToString(0);
		System.out.println(result);

	}

}
