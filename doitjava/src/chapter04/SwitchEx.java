package chapter04;

public class SwitchEx {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor ;
		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
			break;

		}
		System.out.println(ranking + "등 메달이 색깔은" + medalColor + "입니다.");

		if (ranking == 1) {
			medalColor = 'G';
		} else if (ranking == 2) {
			medalColor = 'S';
		} else if (ranking == 3) {
			medalColor = 'B';
		} else   {
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달이 색깔은" + medalColor + "입니다.");

		String pos = "부장";
		switch (pos) {
		case "부장":
			System.out.println("부장의 월급은 400만원입니다.");
			break;
		case "과장":
			System.out.println("과장의 월급은 300만원입니다.");
			break;
		case "대리":
			System.out.println("대리의 월급은 200만원입니다.");
			break;
		default:
			System.out.println("일반 사원의 월급은 150만원입니다.");
		}
	}
}
