package chapter12;

public class Person {

	public String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
@Override
	public String toString() {
		return name;
	}
}
