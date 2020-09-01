package example;

import java.util.Scanner;

public class Guess2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int com = (int) (Math.random() * 100)+1;
		int user = 0;
		int cnt = 0;
		while (true) {
			System.out.println("나는 몇일까요?");
			user = sc.nextInt();
			System.out.println(++cnt+"회");
			
			if (com > user) {
					System.out.println("땡! 더 커");
					cnt += 1;
				} else if (com <user) {
					System.out.println("땡! 더 작아");
					cnt += 1;
				 
			
				

				System.out.println(cnt+"회");
				}else {
					System.out.println("정답!");
					System.out.println(com);
					break;
				}
		}

	}
}