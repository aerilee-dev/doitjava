package chapter08;

public class CarExtendsEx {

	public static void main(String[] args) {
		CarExtends car = new CarExtends();
		for(int i=1; i<=5;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookkTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른 금호타이어로 교체");
				car.frontRightTire = new KumhoTire("앞왼쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLeftTire = new HankookkTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("앞오른 금호타이어로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽",17);
				break;
			}
			System.out.println("------------------------------------");
			
			}
	}

}
