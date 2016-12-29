package homework5.bird;

public class NonFlyingBird extends Bird{

	
	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	public void fly(){
		System.out.println("This bird can not fly");	
	}
}
