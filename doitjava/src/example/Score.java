package example;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어는 몇점이니?");
		int A = sc.nextInt();
		System.out.println("영어는 몇점이니?");
		int B = sc.nextInt();
		System.out.println("수학은 몇점이니?");
		int C = sc.nextInt();
		int sum = (A+B+C);
		double avg= sum /3.0;
		System.out.println("평균은" + avg + "점이네");
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
		System.out.println("너님"+grade+"등급");
	}

}
