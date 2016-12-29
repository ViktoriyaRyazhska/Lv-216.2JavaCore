package homework5.bird;

public class BirdMain {
	
	public static void main(String[] args) {
		Bird bird[] = new Bird[8];

		bird[0] = new Eagle("has a feathers", "lay Eggs");
		bird[1] = new Swallow("has a feathers", "lay Eggs");
		bird[2] = new Penguin("doesn't have a feathers", "lay Eggs");
		bird[3] = new Eagle("has a feathers", "lay Eggs");
		bird[4] = new Penguin("doesn't have a feathers", "lay Eggs");
		bird[5] = new Chicken("has a feathers", "lay Eggs");
		bird[6] = new Swallow("has a feathers", "lay Eggs");
		bird[7] = new Chicken("has a feathers", "lay Eggs");

		for (int i = 0; i < bird.length; i++) {
			System.out.println(bird[i]);
			bird[i].fly();	
		}
	}
}
