package Task2HW6;

import java.util.Random;

public class Employee implements ICalculate{
	String employeeld;
	protected String name;
	protected double averageMonthlySalary = 0;
	
	public Employee() {
		Random random = new Random();
		this.employeeld = "ID"+ Integer.toString(random.nextInt(90000));
	}
	
	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonthlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}
	
	@Override
	public double calculatePay() {
		return 0;
	}
	
}
