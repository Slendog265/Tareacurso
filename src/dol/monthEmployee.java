package dol;

public class monthEmployee extends Person {
	
	private Double minimumWage;
	private Double netSalary;
	
	
	public monthEmployee ( ) {
	
	}

	

	public monthEmployee(String firstName, String secondName, String fisrtLname, String secondLname, String id,
			Double iNSS, Double ir, Double toDedud, Double minimumWage, Double netSalary) {
		super(firstName, secondName, fisrtLname, secondLname, id, iNSS, ir, toDedud);
		this.minimumWage = minimumWage;
		this.netSalary = netSalary;
	}



	public Double getMinimumWage() {
		return minimumWage;
	}

	public void setMinimumWage(Double minimumWage) {
		this.minimumWage = minimumWage;
	
	}

	public Double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void showData2 () {
		System.out.printf("||#%s||%s %s||%s %s||\n||", 
				getId(),
				getFirstName(),
				getSecondName(),
				getFisrtLname(),
				getSecondLname()
				);
		System.out.printf("\n||Salario Minimo = \033[33m%s\u001B[0m  \n||INSS = \033[33m%s\u001B[0m \n||IR = \033[33m%s\u001B[0m \n||Deducciones = \033[32m%s \u001B[0m \n||Salario Neto = \033[32m%s \u001B[0m " ,
				getMinimumWage(),
				getINSS(),
				getIr(),
				getToDedud(),
				getNetSalary()
				);
	}

}
