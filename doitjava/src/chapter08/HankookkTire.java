package chapter08;

public class HankookkTire extends Tire {
	

		public HankookkTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
			
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if (accumulatedRotation < maxRotation) {
				System.out.println(location + "�ѱ�Tire ����" + (maxRotation - accumulatedRotation) + "ȸ");
				return true;
			}

			else {
				System.out.println("***" + location + "�ѱ�Tire��ũ***");
			}
			return false;
		}

	}

