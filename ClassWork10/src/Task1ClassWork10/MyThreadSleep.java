package Task1ClassWork10;

public class MyThreadSleep extends Thread {
	private int pause;
	
	public MyThreadSleep(int pause){
		this.pause = pause;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			try{
				System.out.println("I study Java");
				sleep(pause);
			}catch(InterruptedException e){}
		}
	}
}
