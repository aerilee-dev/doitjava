package chapter08;

public class InstanceOfEx {
	public static void method1(ParentInst parent) {
		if(parent instanceof ChildInst) {
			ChildInst child = (ChildInst)parent;
			System.out.println("1-C로 변환-q");
		}else {
			System.out.println("1-C로 실패-w");
		}
	}
	public static void method2(ParentInst parent) {
		ChildInst child=(ChildInst)parent;
		System.out.println("2-C로 변환-e");
	}
	public static void main(String[]args) {
		ParentInst parentA = new ChildInst();
		method1(parentA);
		method2(parentA);
		ParentInst parentB = new ParentInst();
		method1(parentB);
		method2(parentB);
	}
}
