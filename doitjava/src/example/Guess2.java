package example;

import java.util.Scanner;

public class Guess2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int com = (int) (Math.random() * 100)+1;
		int user = 0;
		int cnt = 0;
		while (true) {
			System.out.println("���� ���ϱ��?");
			user = sc.nextInt();
			System.out.println(++cnt+"ȸ");
			
			if (com > user) {
					System.out.println("��! �� Ŀ");
					cnt += 1;
				} else if (com <user) {
					System.out.println("��! �� �۾�");
					cnt += 1;
				 
			
				

				System.out.println(cnt+"ȸ");
				}else {
					System.out.println("����!");
					System.out.println(com);
					break;
				}
		}

	}
}