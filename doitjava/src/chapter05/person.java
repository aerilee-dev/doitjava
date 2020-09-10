package chapter05;

public class person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	public person(String name, int height, double weight, char gender, boolean married) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
	}
	public person() {
		super();
		this.name = "ȫ�浿";
		this.height = 180;
		this.weight = 75.5;
		this.gender = 'M';
		this.married = false;
	}
	
}
