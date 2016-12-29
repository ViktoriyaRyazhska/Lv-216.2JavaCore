package practicaltask5;

public class Cat implements Animal{
	private String name;
	
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name) {
		super();
		this.name = name;
	}
	public void voice(){
		System.out.println(name + " said meow ");
	}
	public void feed(){
		System.out.println(name +" eat whiskas  ");
	}
}
