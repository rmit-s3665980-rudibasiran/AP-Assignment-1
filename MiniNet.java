package APAssignment1;

import java.util.ArrayList;

public class MiniNet {
	private ArrayList<Person> persons = new ArrayList<Person>();

	public void add(Person p) {
		persons.add(p);
	}

	public void print() {
		for (int i = 0; i < persons.size(); i++)
			System.out.println("Person " + (i) + " details: " + persons.get(i).getName());
	}
}
