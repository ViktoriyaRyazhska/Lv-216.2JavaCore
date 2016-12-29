package practicaltask5;

public class Dog implements Animal {
	private String name;
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		super();
		this.name = name;
	}
	public void voice(){
		System.out.println(name +" say gav gav");
	}
	public void feed(){
		System.out.println(name +" eat pedigree");
	}
}
