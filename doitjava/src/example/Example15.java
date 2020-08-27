package example;
import java.util.Scanner;
public class Example15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
		System.out.println("몇 줄을 출력하시겠습니까?(홀수만 입력)");
		line = sc.nextInt();
		}while (line % 2 == 0);
		int upline = line / 2;
		int downline = line-upline;
		
		for(int i=0;i<upline;i++) {
			for(int j=0;j<=i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
				for(int i=downline-1; i>=0; i--) {
					for (int j=0; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
