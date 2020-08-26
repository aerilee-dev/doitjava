package example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
	

		Scanner sc2 = new Scanner(System.in);
		System.out.println("¼ýÀÚ ¸»ÇÏ¼À:");
		int num2 = sc2.nextInt();
		String str = "";		//ÇÑ¹ø¿¡ ÇÁ¸°Æ®! ¿À!
		if(num2 % 2 == 0) {
			str="Â¦¼ö";
		}else {
				str="È¦¼ö";
		}
		System.out.println(str);
		System.out.println(num2 % 2 == 0 ? "Â¦¼ö2" : "È¦¼ö2");
		sc2.close();
	}

}
