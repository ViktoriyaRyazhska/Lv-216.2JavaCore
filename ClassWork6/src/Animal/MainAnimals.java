package Animal;

public class MainAnimals {

	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Dog();
		
		for(int i = 0; i < animals.length; i++){
			animals[i].voice();
			animals[i].feed();
			System.out.println("*****************");
		}
	}

}
