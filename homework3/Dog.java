package homework3;

public class Dog {
	public enum breeds {
		Buldog, Pitbull, Rotveiler, Pudel, Doberman, Huskey
	}

	private String name;
	private breeds breed;
	private int age;

	public Dog() {
		super();
	}

	public Dog(String name, breeds breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("Charik", breeds.Buldog, 10);
		Dog dog2 = new Dog("Barsik", breeds.Pitbull, 8);
		Dog dog3 = new Dog("Lord", breeds.Huskey, 11);

		if (dog1.name == dog2.name) {
			System.out.println("dog1 have the same name with dog2");
		}
		if (dog1.name == dog3.name) {
			System.out.println("dog1 have the same name with dog3");
		}
		if (dog2.name == dog3.name) {
			System.out.println("dog2 have the same name with dog3");
		}
		if (dog1.age > dog2.age)
			if (dog1.age > dog3.age) {
				System.out.println(dog1.name);
				System.out.println(dog1.breed);
			}
		if (dog2.age > dog1.age)
			if (dog2.age > dog3.age) {
				System.out.println(dog2.name);
				System.out.println(dog2.breed);
			}
		if (dog3.age > dog1.age)
			if (dog3.age > dog2.age) {
				System.out.println(dog3.name);
				System.out.println(dog3.breed);
			}

	}

}
