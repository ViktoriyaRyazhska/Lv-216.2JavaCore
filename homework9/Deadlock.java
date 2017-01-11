package homework9;

public class Deadlock {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized(Deadlock.class){
					System.out.println("abc");
					Thread.yield();
				}
			}
		};
//		Thread t2 = new Thread() {
//			public void run() {
//				synchronized (second) {
//					Thread.yield();
//					synchronized (first) {
//					System.out.println("edf");
//					}
//				}
//			}
//
//		};
		synchronized(first){
		Thread.yield();
		//t1.start();
		//System.out.println("thread main");
		//t2.start();
		}
		t1.start();
		System.out.println("thread main");
		}
		
}