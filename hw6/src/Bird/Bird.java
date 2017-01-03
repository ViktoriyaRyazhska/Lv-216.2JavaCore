package Bird;

public abstract class Bird {
	String feathers;
	int layeggs;
	
	abstract void fly();

	public Bird(String feathers, int layeggs) {
		this.feathers = feathers;
		this.layeggs = layeggs;
	}
	
	void showInfo(){
		System.out.println("Bird feathers: " + feathers + " " + " and layeggs:" + layeggs );
	}
	
}
	
	