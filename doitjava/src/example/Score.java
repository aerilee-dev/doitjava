package example;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����̴�?");
		int A = sc.nextInt();
		System.out.println("����� �����̴�?");
		int B = sc.nextInt();
		System.out.println("������ �����̴�?");
		int C = sc.nextInt();
		int sum = (A+B+C);
		double avg= sum /3.0;
		System.out.println("�����" + avg + "���̳�");
		char grade = 0 ;
		if(avg>90) {
			grade = 'A';
		}
		else if(avg>80) {
			 grade = 'B';
		}
		else if(avg>70) {
			 grade = 'C';
		}
		else {
			grade = 'F';
		}
		System.out.println("�ʴ�"+grade+"���");
	}

}
