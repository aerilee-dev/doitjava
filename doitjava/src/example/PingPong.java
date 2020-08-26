package example;

public class PingPong {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			
			if (i%3!=0 && i%5!=0) {
				continue;
			}
			
			else if(i%3==0 && i%5==0) {
				System.out.println("PingPong");
			}
			
			else if(i%3==0) {
				System.out.println("Ping");
			}
			else if(i%5==0){
				System.out.println("Pong");
			
			}
			else {
				System.out.println();
			}
			
		}
	for(int i=1; i<=100;i++) {
		System.out.println(i+"");
		if(i%3 == 0) {
			System.out.println("Ping");
		}
		if(i%5==0){
			System.out.println("Pong");
	}
		System.out.println();
	
		}
	}

}
