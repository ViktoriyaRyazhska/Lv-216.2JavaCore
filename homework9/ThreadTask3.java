package homework9;

class Thread1 implements Runnable {
	@Override
	public void run() {
	Runnable r2 = new Thread2();
	Thread t1 = new Thread(r2);
	t1.start();
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}

	}
}

class Thread3 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}

	}
}

public class ThreadTask3 {

	public static void main(String[] args) {
Runnable r1 = new Thread1();
Thread t2 = new Thread(r1);
t2.start();

Runnable r3 = new Thread3();
Thread t3 = new Thread(r3);
t3.start();
	}

}
