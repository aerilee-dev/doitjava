package chapter14;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoClosebj obj = new AutoClosebj()) {
			throw new Exception();
	} catch(Exception e) {
		System.out.println("예외 부분");
	}
}
}