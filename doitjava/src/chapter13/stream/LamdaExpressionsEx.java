package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsEx {

	public static void main(String[] args) {
		List<Student>list = Arrays.asList(	//asList 로 만들면 추가,삭제 불가능.
				new Student("홍길동",90),
				new Student("신용권",92)
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
		});		//메서드를 연속적으로 사용 가능(메서드체인)
		
		list.stream().forEach(s -> System.out.println(s.getName() +"-"+s.getScore()));
			
		
	}

}
