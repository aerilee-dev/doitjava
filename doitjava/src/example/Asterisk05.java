package example;

public class Asterisk05 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (j < 6 - i) {
					System.out.print(" ");
				} else if (j > 6 - i) {
					System.out.print(" ");				//바보야! 같으면 제이 아니면 공백으로 하면 되지!
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}