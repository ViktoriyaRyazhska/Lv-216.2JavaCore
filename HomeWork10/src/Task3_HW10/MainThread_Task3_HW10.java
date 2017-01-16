package Task3_HW10;

/**
 * @author Masha
 * Create a thread «one», which would start the thread «two», which has 
 * to output its number («Thread number two») 3 times and create thread 
 * «three», which would to output message «Thread number three» 5 times.
 */
public class MainThread_Task3_HW10 {

	public static void main(String[] args) {
		Thread_Task3_HW10 one = new Thread_Task3_HW10();
		one.start();
	}

}
