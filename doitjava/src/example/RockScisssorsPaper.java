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
		System.out.println("����������!!!");
		while (true) {

			com = (int) (Math.random() * 3);

			user = sc.nextInt();

			if (user > 2) {
				System.out.println("NOPE!");
				continue;

			}
			System.out.println("��ǻ�� : " + (com == 0 ? "����" : (com == 1 ? "����" : "��")));
			System.out.println("�� : " + (user == 0 ? "����" : (user == 1 ? "����" : "��")));
			if ((com == sci && user == roc) || (com == roc && user == pap) || (com == pap && user == sci)) {
				System.out.println("�ʴ� ��");
				score += 100;
			} else if (com == user) {
				System.out.println("���");
				score += 10;
			} else {
				System.out.println("���� ��");
				life--;
			}
			System.out.println("score : " + score);
			System.out.println("life : " + life);

			if(life<=0) {
				System.out.println("�ʴ� ��������");
				break;
			}
		}
		
	}

}
