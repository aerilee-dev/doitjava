package example;

import java.util.Scanner;

public class Game3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �ñ��ϴ�?");
		
		int thisMon = 0;
		thisMon = sc.nextInt();
		
		switch(thisMon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "���� 31�ϱ�����");
				break;
			case 2:
				System.out.println(thisMon + "���� 28�ϱ�����");
				break;
			default:
				System.out.println(thisMon + "���� 30�ϱ�����");
				
		}
		sc.close();
	}

}
