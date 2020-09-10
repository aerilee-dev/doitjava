package chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	/*생성자 - 객체를 생성할 때 실행하는 블록*/
	
	Student(int num1,long num2) {	//매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다."+ num1);
	}
	Student(int num1,int num2) {	//매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다."+ num1);
	}
	Student(long num1,int num2) {	//매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다."+ num1);
	}
	Student(int num) {	//매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다."+ num);
	}	
//	Student(){}	//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자

Student(){
	System.out.println("디폴트 생성자로 Student 객체를 생성합니다.");
}	
Student(char num){
	System.out.println(num);
}
	//	메소드(메서드) - 멤버함수
	public void showStudentInfo() { 
		System.out.println(studentName + "," + address);
	}
	
}
