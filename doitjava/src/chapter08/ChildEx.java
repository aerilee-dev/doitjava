package chapter08;

public class ChildEx {
public static void main(String[] args) {
	Child child = new Child();
	
	parent parent = child;
	parent.method1();
	parent.method2();
//	parent.method3(); 호출불가능
}
}
