package APAssignment1;

public class Child extends Person {
	private Parent myFather;
	private Parent myMother;

	public Child(String name, Parent dad, Parent mum) {
		super(name);
		myFather = dad;
		myMother = mum;
	}

	public Parent getFather() {
		return myFather;
	}

	public Parent getMother() {
		return myMother;
	}

}