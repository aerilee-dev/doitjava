package chapter04;

public class Metrocity {

	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;
		System.out.println("���� ���ô� ��Ʈ���Դϱ�?");
		isCapital = false;
		citizens = 150;
		riches = 80;

//		if (isCapital  ) {
//			if (citizen >= 100) {
//				isMetro = true;
//				
//			}else if (riches>=50) {
//				isMetro = true;
//			
//			}else {
//				isMetro = false;
//			}
//		}else {
//			if(riches>=50) {
//				isMetro = true;
//			
//			}
//		}
		isMetro = (isCapital && citizens >= 100) || (riches >= 50) ? true : false;

		System.out.println("�������� : " + isCapital);
		System.out.println("�α��� : " + citizens + "����");
		System.out.println("���ڼ� : " + riches + "����");
		System.out.println(isMetro ? "��Ʈ���������Դϴ�" : "��Ʈ���������� �ƴմϴ�.");

	}

}
