package chapter04;

//���ڸ� �Է¹޾Ƽ� �Է� ���� ���ڰ� Ȧ������ ¦������ ����ϼ���.
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ :");
		int Num =sc.nextInt();	//
		if(Num % 2 == 1) {
			System.out.println("Ȧ");
		}else {
				System.out.println("¦");
			}
		sc.close();
		}
	
	}


