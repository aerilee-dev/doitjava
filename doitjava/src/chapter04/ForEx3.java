package chapter04;

public class ForEx3 {

	public static void main(String[] args) {
		int i, j;
		for(i=0; i<4; i++)	{
			for(j=0; j<7; j++) {	
				if(j%2 == 0){
					continue;//���ο� �ܺο� ���� ������ ����ϸ� �ȵȴ�.
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {		//������ �ִ� �ݺ��������� ���� ������ ����ص� �ȴ�.
			System.out.println("hello");
		}
	}

}
