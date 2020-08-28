package example;

import java.util.Scanner;

public class RockScisssorsPaper {

	public static void main(String[] args) {
		final int sci = 0;
		final int roc = 1;
		final int pap = 2;

		int user, com;
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보!!!");
		while (true) {

			com = (int) (Math.random() * 3);

			user = sc.nextInt();

			if (user > 2) {
				System.out.println("NOPE!");
				continue;

			}
			System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.println("나 : " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
			if ((com == sci && user == roc) || (com == roc && user == pap) || (com == pap && user == sci)) {
				System.out.println("너님 승");
				score += 100;
			} else if (com == user) {
				System.out.println("비김");
				score += 10;
			} else {
				System.out.println("유저 패");
				life--;
			}
			System.out.println("score : " + score);
			System.out.println("life : " + life);

			if(life<=0) {
				System.out.println("너님 죽음");
				break;
			}
		}
		
	}

}
