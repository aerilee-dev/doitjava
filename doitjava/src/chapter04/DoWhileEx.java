package chapter04;

public class DoWhileEx {

	public static void main(String[] args) {
		int num =1;
		int sum = 0;
		 
		do {
			sum += num++;
			
		} while(num<= 10);
		
		System.out.println("1에서 10까지의 합은" + sum + "입니다.");
		
		num=11;
		sum =0;
		while(num <=10) {
			sum += num++;
		}
		System.out.println("1에서 10까지의 합은" + sum + "입니다.");
		
		num=11;
		sum =0;		
		do {					//do while 는 최소 한번은 실행하지.
			sum += num++;
			
		} while(num<= 10);
		
		System.out.println("1에서 10까지의 합은" + sum + "입니다.");
	}

}
