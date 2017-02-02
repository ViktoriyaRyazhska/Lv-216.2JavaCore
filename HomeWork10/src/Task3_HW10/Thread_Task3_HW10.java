package Task3_HW10;

public class Thread_Task3_HW10 extends Thread {

	@Override
	public void run() {
		Thread two = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread two is running");
				}
				Thread three = new Thread() {
					public void run() {
						for (int i = 0; i < 5; i++) {
							System.out.println("Thread three is running");
						}
					}
				};
				three.start();
			}
		};
		two.start();
	}
}