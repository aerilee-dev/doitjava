package chapter14;

public class AutoClosebj implements AutoCloseable {
@Override
public void close() throws Exception {
	System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
}
}
