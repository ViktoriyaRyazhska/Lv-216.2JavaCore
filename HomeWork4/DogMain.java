package HomeWork4;

import HomeWork4.Dog.Breed;

public class DogMain {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Pes",2, Breed.DobermanPinscher);
		Dog dog2 = new Dog("Pes",5,Breed.FrenchBulldog);
		Dog dog3 = new Dog("Sobaka",7,Breed.Mastiff);
		
		if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName())
				|| dog1.getName().equals(dog3.getName())) {
			    System.out.println("There are the same name");
			} else {
			    System.out.println("There are not the same name");
			}
			if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			    System.out.println("The oldest dog is " + dog1.breed + " " + dog1.getName());
			} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			    System.out.println("The oldest dog is " + dog2.breed + " " + dog2.getName());
			} else {
			    System.out.println("The oldest dog is " + dog3.breed + " " + dog3.getName());
			}
		    }
		
		
	}


