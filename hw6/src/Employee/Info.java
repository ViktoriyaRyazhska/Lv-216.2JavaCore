package Employee;

public class Info {

	public static void main(String[] args) {
		Employee employee1[] = new Employee[4];
		employee1[0]= new SalariedEmployee("1",30,40,"40");
		employee1[1]= new SalariedEmployee("2",40,40,"60");
		employee1[2]= new ContractEmployee("3",4000);
		employee1[3]= new ContractEmployee("4",1500);
		for(int i = 0; i<4; i++){
		System.out.println("Information about employee_"+i+":");
		System.out.println("employee Id: "+employee1[i].getEmployeeId());
		((CalcPay) employee1[i]).calculatePay();
		System.out.println(" ");
	}
	}
	
	}


