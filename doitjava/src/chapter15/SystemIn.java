package chapter15;

import java.io.IOException;

public class SystemIn {
	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� ���� �� ��������");

		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
