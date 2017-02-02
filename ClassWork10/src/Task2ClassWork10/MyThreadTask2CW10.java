package Task2ClassWork10;

public class MyThreadTask2CW10 extends Thread {
	private int pause;
	private String str;
	
	public MyThreadTask2CW10(int pause, String str) {
		this.pause = pause;
		this.str = str;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				System.out.println(str);
				sleep(pause);
			}catch(InterruptedException e){}
			System.out.println("");
		}
	}
}
