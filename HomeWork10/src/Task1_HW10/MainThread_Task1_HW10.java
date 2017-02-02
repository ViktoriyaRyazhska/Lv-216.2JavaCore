package Task1_HW10;

/**
 * @author Masha
 * Run three threads and output there different messages for 5 times. The third 
 * thread supposed to start after finishing working of the two previous threads.
 */

public class MainThread_Task1_HW10 {
	public static void main(String[] args) throws Exception{
		Thread t1 = new ThreadTask1_HW10(1500, "Hello, Hello, Hello!");
		Thread t2 = new ThreadTask1_HW10(2000, "I learn Java");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Threads t1 and t2 have already stopped!!!!!!!!!!!!!!!!!!!!! \n");
		Thread t3 = new ThreadTask1_HW10(500, "Third Thread is running!");
		t3.start();
	}
}
