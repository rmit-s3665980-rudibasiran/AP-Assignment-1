package APAssignment1;

public class TestClass {
	public static void main(String[] args) {
		MiniNet mininet = new MiniNet();
		Person person;
		for (int i = 0; i < 20; i++) {
			person = new Person("Rudi " + i);
			mininet.add(person);
		}

		mininet.print();
	}

}