package Lesson5Task2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Employee {
	String name;
	int department_number;
	double salary;
	
	Employee(){
		Random random = new Random();
		this.name = "Employee_"+ random.nextInt(200);
		this.department_number = random.nextInt(3)+1;
		//this.salary = ((random.nextInt(1000000)+1)*0.01);
		this.salary = new BigDecimal((random.nextInt(1000000)+1)*0.01).setScale(2, RoundingMode.UP).doubleValue(); 
	}
	
	Employee(String name, int department_number, double salary){
		this.name = name;
		this.department_number = department_number;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment_number() {
		return department_number;
	}

	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "Employee [name= " + name + ", department_number= " + department_number + ", Salary= " + salary + "]";
	}
	
}
