package chapter04;
import java.util.Scanner;	//ctrl + shift + o
public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
		inputString = scan.nextLine();
		System.out.println(">");
		inputString = scan.nextLine();
		}
		while (!inputString.equals("q"));	//!�� ����(not)
			
			System.out.println(inputString);
			System.out.println();
			System.out.println("���α׷� ����");
		scan.close();
	}

}
