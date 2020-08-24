package chapter04;

public class ForEx3 {

	public static void main(String[] args) {
		int i, j;
		for(i=0; i<4; i++)	{
			for(j=0; j<7; j++) {	
				if(j%2 == 0){
					continue;//내부와 외부에 같은 변수를 사용하면 안된다.
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {		//동위에 있는 반복문에서는 같은 변수를 사용해도 된다.
			System.out.println("hello");
		}
	}

}
