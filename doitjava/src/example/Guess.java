package example;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		int user, com;
		int times = 0;

		Scanner sc = new Scanner(System.in);
		
		com = (int) (Math.random() * 100)+1;
		
		while (true) {
			System.out.println("나는 몇일까요?");
			user = sc.nextInt();
			
			
			if (com != user) {
				if (com > user) {
					System.out.println("땡! 더 커");
					times += 1;
				} else {
					System.out.println("땡! 더 작아");
					times += 1;
				 
			
				}

				System.out.println(times+"회");
				}else {
					System.out.println("정답!");
					System.out.println(com);
				}
		}

	}
}