package chapter04;
import java.util.Scanner;	//ctrl + shift + o
public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
		inputString = scan.nextLine();
		System.out.println(">");
		inputString = scan.nextLine();
		}
		while (!inputString.equals("q"));	//!는 반전(not)
			
			System.out.println(inputString);
			System.out.println();
			System.out.println("프로그램 종료");
		scan.close();
	}

}
