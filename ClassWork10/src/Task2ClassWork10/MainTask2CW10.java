package Task2ClassWork10;

/**
 * @author Masha
 * Output two messages «Hello, world» and «Peace in the peace» 
 * 5 times each with the intervals of 2 seconds, and the second - 3 seconds. 
 * After printing messages, print the text «My name is …»
 */
public class MainTask2CW10 {
	public static void main(String[] args) throws Exception{
		Thread t1 = new MyThreadTask2CW10(2000, "Hello, world");
		Thread t2 = new MyThreadTask2CW10(3000, "Peace in the peace");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is ...");
	}

}
