package chapter08;

public class CarExtendsEx {

	public static void main(String[] args) {
		CarExtends car = new CarExtends();
		for(int i=1; i<=5;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookkTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ��� ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new KumhoTire("�տ���",13);
				break;
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire = new HankookkTire("�ڿ���",14);
				break;
			case 4:
				System.out.println("�տ��� ��ȣŸ�̾�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����",17);
				break;
			}
			System.out.println("------------------------------------");
			
			}
	}

}
