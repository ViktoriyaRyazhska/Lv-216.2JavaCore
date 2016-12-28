package Task2HW6;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] employee = new Employee[5];
		employee[0] = new SalariedEmployee("Vasja", 4500.45, "Secure2345");
		employee[1] = new SalariedEmployee("Vitja", 6145.21, "secure34219");
		employee[2] = new SalariedEmployee("Olegh", 3985.45, "Secure5689790");
		employee[3] = new ContractEmployee("Nadja", 189, 35.10, "federalMember234345");
		employee[4] = new ContractEmployee("Ighor", 165, 32.89, "federalMember787544");
		
	//Sorting By salary descending
		Employee tmp;
		for(int i = 0; i < employee.length-1; i++){
			for(int j = i + 1; j < employee.length; j++) {
				//if (((ICalculate)employee[i]).calculatePay() < ((ICalculate)employee[j]).calculatePay()) {
				if (employee[i].calculatePay() < employee[j].calculatePay()) {
					tmp = employee[i];
					employee[i] = employee[j];
					employee[j] = tmp;
				}
			}
		}
		
		for(Employee el: employee){
			System.out.println(el);
		}
	}

}
