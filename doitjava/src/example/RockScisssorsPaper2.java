package example;

import java.util.Scanner;

public class RockScisssorsPaper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위~바위~보!");
		System.out.print("");
		
		
		while(true) {
			System.out.println(">");
			int line = sc.nextInt();
			int num=0;
			num = (int)(Math.random()*3);
		
			if(line>2) {
			System.out.println("NOPE!");
			continue;
		}
		
		if(line==num) {
			System.out.println("draw");
		}else if(line==2 && num==1) {
			System.out.println("lose");
			if(line==2 && num==0) {
				System.out.println("win");
			}
		}else if(line==1 && num==2) {
			System.out.println("win");
			if(line==1 && num==2) {
				System.out.println("lose");
			}
		}else if(line==0 && num==2) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
			
		}
		
		
		
	
		}
	
	
	}

}
