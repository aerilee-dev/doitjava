package chapter05;

import java.util.Scanner;

public class FunctionTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();
		Student seo = new Student();
		
		
		System.out.println(kim==seo); //�� ��ü�� ���� ��ü�� �ƴϴ�.
		
		//method ȣ��
		kim.showStudentInfo(); 	//��ü�� �ʱⰪ�� null�̰�, int�� 0�̰�, boolean�� false��.
		//��ü�� ����� ��Ʈ������(.)�� �̿��Ͽ� ������ �� �ִ�.
		kim.studentID=2020010001;
		kim.studentName="������";
		kim.grade = 3;
		kim.address="����";
		kim.showStudentInfo();
		
		seo.studentID = 2020010002;
		seo.studentName="������";
		kim.grade = 1;
		seo.address="����";	
		seo.showStudentInfo();
		
		Student jo = new Student();
		jo.studentName="������";
		jo.showStudentInfo();
		
	}

}
