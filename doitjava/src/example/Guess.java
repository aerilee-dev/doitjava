package example;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		int user, com;
		int times = 0;

		Scanner sc = new Scanner(System.in);
		
		com = (int) (Math.random() * 100)+1;
		
		while (true) {
			System.out.println("���� ���ϱ��?");
			user = sc.nextInt();
			
			
			if (com != user) {
				if (com > user) {
					System.out.println("��! �� Ŀ");
					times += 1;
				} else {
					System.out.println("��! �� �۾�");
					times += 1;
				 
			
				}

				System.out.println(times+"ȸ");
				}else {
					System.out.println("����!");
					System.out.println(com);
				}
		}

	}
}