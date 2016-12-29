package practicaltask5;

public class AnimalMain {
	
	public static void main(String[] args) {
		Animal animal[] = new Animal[6];
		
		animal [0] = new Dog("Scharik");
		animal [1] = new Dog("Bobyk");
		animal [2] = new Dog("Barsik");
		animal [3] = new Cat("Murchik");
		animal [4] = new Cat("Murka");
		animal [5] = new Dog("Sirko");
		
		for(int i=0;i<animal.length;i++){
			animal[i].feed();
			animal[i].voice();
		}

	}

}
