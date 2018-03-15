package APAssignment1;

public class Parent extends Person {
	private int age;

	public Parent(String name, int a) {
		super(name);
		this.age = a;
	}

	public int getAge() {
		return age;
	}
}