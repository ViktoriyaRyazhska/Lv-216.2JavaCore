package homework9;

class Run1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("First message");
		}
	}
}

class Run2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Second message");
		}

	}
}

class Run3 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Third message");
		}

	}
}

public class ThreeThreads {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Run1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new Run2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new Run3();
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t2.join();
		t1.join();

	}

}
