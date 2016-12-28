package hw4;

public class Car {
	private String type;
	private int year;
	private double encap;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEncap() {
		return encap;
	}
	public void setEncap(double encap) {
		this.encap = encap;
	}
	public Car(String type, int year, double encap) {
		this.type = type;
		this.year = year;
		this.encap = encap;
	}
	public Car() {
		}
	public Car(String type, double encap) {
		this.type = type;
		this.encap = encap;
	}
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", encap=" + encap
				+ "]";
	}
	
	
	
	
	
	
	

}
