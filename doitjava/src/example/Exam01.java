package example;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��� �ּ���:");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��� �ּ���:");
		int num2 = sc.nextInt();
		if (num1==num2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		
		if(num1==num2) System.out.println("Same2");
		else System.out.println("Different2");
		
		System.out.println(num1 == num2 ? "Smae3" : "Different3");
		
	sc.close();
	}

}
