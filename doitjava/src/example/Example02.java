package example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
	

		Scanner sc2 = new Scanner(System.in);
		System.out.println("���� ���ϼ�:");
		int num2 = sc2.nextInt();
		String str = "";		//�ѹ��� ����Ʈ! ��!
		if(num2 % 2 == 0) {
			str="¦��";
		}else {
				str="Ȧ��";
		}
		System.out.println(str);
		System.out.println(num2 % 2 == 0 ? "¦��2" : "Ȧ��2");
		sc2.close();
	}

}
