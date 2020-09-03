package example;

public class Asterisk01 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {	//ROW(행,줄) <-요게 와이축이 됨
			for (int j = 0; j < 5; j++) {	//COLUMN (열,칸) <-요게 엑스축이 되고
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
