package chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	/*������ - ��ü�� ������ �� �����ϴ� ���*/
	
	Student(int num1,long num2) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�."+ num1);
	}
	Student(int num1,int num2) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�."+ num1);
	}
	Student(long num1,int num2) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�."+ num1);
	}
	Student(int num) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�."+ num);
	}	
//	Student(){}	//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������

Student(){
	System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�.");
}	
Student(char num){
	System.out.println(num);
}
	//	�޼ҵ�(�޼���) - ����Լ�
	public void showStudentInfo() { 
		System.out.println(studentName + "," + address);
	}
	
}
