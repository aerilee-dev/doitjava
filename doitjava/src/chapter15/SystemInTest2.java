package chapter15;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개 쓰고 엔터 하셈");

		int i;
		try {
			while ((i = System.in.read( )) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
