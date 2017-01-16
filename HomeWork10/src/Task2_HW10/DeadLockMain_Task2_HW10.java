package Task2_HW10;

/**
 * @author Masha
 * Cause a deadlock. Organize the expectations of ending a thread in main(), 
 * and make the end of the method main() in this thread.
 */
public class DeadLockMain_Task2_HW10 {
	
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) {
		Thread t1 = new Thread() {
			public void run() {
		    	synchronized (first) {
		    		Thread.yield();
		    		synchronized (second) {
		    			System.out.println("Success!");
		            }  
		    	}
		    }
	    };
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
