package chapter14;

public class ArrayException {
	public static void main(String[] args) {
		try {
		int[] arr =new int[3];
		arr[4] = 100 ;
		System.out.println("정상 실행 했음");
		} catch (ArithmeticException e) {
			System.out.println("산술연산에 문제 발생");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 범위 벗어남");
		}finally {
			System.out.println("무조건 실행 구간");
		}
	}	
}
