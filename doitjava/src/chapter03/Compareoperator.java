package chapter03;

public class Compareoperator {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1<= num2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

		char char1 = 'A', char2 = 'B';	//A�� 54 B�� 66�̴�.
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4);
		
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		String str3 =new String("�ڹ�");
		
		System.out.println(str1 == str2);	
		System.out.println(str2 == str3);	//��ü�� �ּҰ� ���Ĵ� ����
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));	//���� ���Ĵ� ����
		
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		result -= 5;
		System.out.println("result = " + result);
		result *= 3;
		System.out.println("result = " + result);
		result /= 5;
		System.out.println("result = " + result);
		result %= 3;
		System.out.println("result = " + result);
		
		int fatherAge = 45;
		int motherAge = 47;
	
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' :  'F' ;
		
		System.out.println(ch);
		
		int num =15;
		boolean isEven;
		isEven = ((num % 2) == 0) ? true : false;
		System.out.println("¦���ΰ���?" + (isEven? "¦��" : "Ȧ��"));
		
	}

}