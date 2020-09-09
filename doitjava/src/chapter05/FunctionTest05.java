package chapter05;

public class FunctionTest05 {

	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}

}
class Obj {
	
	int add(int a, int b) {
		return a+b+c;
	}
	int c=10;	//객체지향의 장점! 아래에 선언해도 위에서 대입할 수 있다.
	
}


