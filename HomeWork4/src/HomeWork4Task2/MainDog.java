package HomeWork4Task2;

public class MainDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Tyzik", "breed1", 5);
		Dog dog2 = new Dog("GavGav", "breed2", 12);
		Dog dog3 = new Dog("Tyzik", "breed3", 7);
		//Find the same name of the dog
		if((dog1.getName() != dog2.getName())&&(dog1.getName() != dog3.getName())
				&&(dog2.getName() != dog3.getName())){
			System.out.println("There is no dogs with the same name.");
		}else if((dog1.getName() == dog2.getName()) && (dog2.getName() == dog3.getName())){
			System.out.println("There are three dogs with the same name: " + dog1.getName());
		}else if((dog1.getName() == dog2.getName())||(dog1.getName() == dog3.getName())){
			System.out.println("There are two dogs with the same name: " + dog1.getName());
		}else if(dog3.getName() == dog2.getName()){
			System.out.println("There are two dogs with the same name: " + dog3.getName());
		}
		//Look for the name and the kind of the oldest dog
		if((dog1.getAge() > dog2.getAge())&&(dog1.getAge() > dog3.getAge())){
			System.out.print(dog1.getName() + " is the oldest dog. ");
			System.out.println("His breed is " + dog1.getBreed());
		}else if((dog2.getAge() > dog1.getAge())&&(dog2.getAge() > dog3.getAge())){
			System.out.print(dog2.getName() + " is the oldest dog. ");
			System.out.println("His breed is " + dog2.getBreed());
		}else if((dog3.getAge() > dog1.getAge())&&(dog3.getAge() > dog2.getAge())){
			System.out.print(dog3.getName() + " is the oldest dog. ");
			System.out.println("His breed is " + dog3.getBreed());
			System.out.println("*********************************");
			System.out.println();
		}
	}
}
