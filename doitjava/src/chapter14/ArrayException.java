package chapter14;

public class ArrayException {
	public static void main(String[] args) {
		try {
		int[] arr =new int[3];
		arr[4] = 100 ;
		System.out.println("���� ���� ����");
		} catch (ArithmeticException e) {
			System.out.println("������꿡 ���� �߻�");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("�迭�� ���� ���");
		}finally {
			System.out.println("������ ���� ����");
		}
	}	
}
