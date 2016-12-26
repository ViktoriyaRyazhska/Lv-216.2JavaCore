package Animal;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("The voice of Dog!!!");
		
	}

	@Override
	public void feed() {
		System.out.println("The Dog is feeding");
		
	}

}
