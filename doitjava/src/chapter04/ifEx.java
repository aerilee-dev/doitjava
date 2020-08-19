package chapter04;

public class ifEx {

	public static void main(String[] args) {
		int score = 80;

		if (score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else {	//else 구문은 it문제엇 false일 경우 실행되는 영역
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

//		if (score < 90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");

		
		
	}

}
