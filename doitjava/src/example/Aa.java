package example;

import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�� ���� ����Ͻðڽ��ϱ�?(Ȧ���� �Է�) : ");
		line = sc.nextInt();
		} while (line % 2 == 0);
		
		int upLine = line/2;
		int downLine = line - upLine;
		
		for(int i = 0; i < upLine; i++) {
			System.out.print(" ");
			for(int j = 0; j < upLine; j++) {
				if(j < upLine - i - 1) {
					System.out.print(" ");
					
				} else {
					if(j == upLine - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			for(int j = 0; j< i; j++) {
				if(j == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = downLine-1;i >= 0; i--) {
			for(int j = 0; j <downLine; j++) {
				if(j < downLine - i - 1) {
					System.out.print(" ");
					
				} else {
					if( j == downLine - i -1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			for(int j = 0; j< i; j++) {
				if(j == i -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			

	}

}