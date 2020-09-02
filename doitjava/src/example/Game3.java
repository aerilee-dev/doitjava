package example;

import java.util.Scanner;

public class Game3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월이 궁금하닝?");
		
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
				System.out.println(thisMon + "월은 31일까지야");
				break;
			case 2:
				System.out.println(thisMon + "월은 28일까지야");
				break;
			default:
				System.out.println(thisMon + "월은 30일까지야");
				
		}
		sc.close();
	}

}
