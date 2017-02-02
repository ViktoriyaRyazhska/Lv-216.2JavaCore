package Task1ClassWork10;

/**
 * @author Masha
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 * 
 */

public class MainTask1ClassWork10 {

	public static void main(String[] args) throws Exception{
		Thread t1 = new MyThreadSleep(1000);
		t1.start();
	}

}
