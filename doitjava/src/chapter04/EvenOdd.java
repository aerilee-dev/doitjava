package chapter04;

//숫자를 입력받아서 입력 받은 숫자가 홀수인지 짝수인지 출력하세요.
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 넣으셈 :");
		int Num =sc.nextInt();	//
		if(Num % 2 == 1) {
			System.out.println("홀");
		}else {
				System.out.println("짝");
			}
		sc.close();
		}
	
	}


