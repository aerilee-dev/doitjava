package chapter08;

public class HankookkTire extends Tire {
	

		public HankookkTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
			
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if (accumulatedRotation < maxRotation) {
				System.out.println(location + "한국Tire 수명" + (maxRotation - accumulatedRotation) + "회");
				return true;
			}

			else {
				System.out.println("***" + location + "한국Tire펑크***");
			}
			return false;
		}

	}

