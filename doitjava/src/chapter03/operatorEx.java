package chapter03;

public class operatorEx {

	public static void main(String[] args) {
		int a = 10, b = 10;	//���� Ÿ���� �� �ٿ� ����� �ʱ�ȭ�� �� �� �ִ�.
		
		int c = 100;
		System.out.println("a++="+a++ +",++b="+(++b));	//�򰥸��ٸ� ��ȣ�� ���
		System.out.println("a="+a+",b="+b);
		
		c++;	//100
		c++;	//101
		c++;	//102
		System.out.println(c++);	//103
		
		System.out.println(c);	//104
		++c;	//105
		c++;	//105
		++c;	//107
		++c;	//108
		++c;	//109
		c++;	//109
		System.out.println(++c);	//111
	}

}
