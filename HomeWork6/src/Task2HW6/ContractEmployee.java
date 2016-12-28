package Task2HW6;

public class ContractEmployee extends Employee implements ICalculate {

	private String name;
	private double hourlyPaid;
	private String federalTaxIdMember;
	private int hours;
	private double rate;
	private double averageMonthlySalary=0;
	
	public ContractEmployee(String name, int hours, double rate, String federalTaxIdMember) {
		super();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.federalTaxIdMember = federalTaxIdMember;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyPaid() {
		return hourlyPaid;
	}

	public void setHourlyPaid(double hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonthlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}

	@Override
	public double calculatePay() {
		setHourlyPaid(hours*rate);
		return averageMonthlySalary = getHourlyPaid();
	}

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", "
				+ "federalTaxIdMember=" + federalTaxIdMember + ", "
				+ "hours=" + hours + ", "
				+ "rate=" + rate + ", "
				+ "averageMonthlySalary=" + String.format("%.2f",averageMonthlySalary) + "]";
	}
	
}
