package Employee;

public class ContractEmployee extends Employee implements CalcPay{
	public int fixedMonthlyPayment;
	public int federalTaxIdmember;

	public ContractEmployee(String employeeId, int fixedMonthlyPayment) {
		super(employeeId);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		
	}

	@Override
	public void calculatePay() {
		int theAverageMonthlySalary = fixedMonthlyPayment;
		System.out.println("Salary = "+theAverageMonthlySalary);
		
		}

}
