package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsEx {

	public static void main(String[] args) {
		List<Student>list = Arrays.asList(	//asList �� ����� �߰�,���� �Ұ���.
				new Student("ȫ�浿",90),
				new Student("�ſ��",92)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name +"-"+score);
		});
		
		list.stream().forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name +"-"+score);
		});		//�޼��带 ���������� ��� ����(�޼���ü��)
		
		list.stream().forEach(s -> System.out.println(s.getName() +"-"+s.getScore()));
			
		
	}

}
