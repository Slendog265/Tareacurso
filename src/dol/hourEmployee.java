package dol;

public class hourEmployee extends Person {
	
	private Integer Hour;
	private Integer xtraHours;
	private Integer Tar;
	private Integer xtraTar;
	private Integer BruteWage;
	private Double NetSalary;
	
	
	
	public hourEmployee() {
		
	}


	public hourEmployee(String firstName, String secondName, String fisrtLname, String secondLname, String id,
			Double iNSS, Double ir, Double toDedud, Integer hour, Integer xtraHours, Integer tar, Integer xtraTar,
			Integer bruteWage, Double netSalary) {
		super(firstName, secondName, fisrtLname, secondLname, id, iNSS, ir, toDedud);
		Hour = hour;
		this.xtraHours = xtraHours;
		Tar = tar;
		this.xtraTar = xtraTar;
		BruteWage = bruteWage;
		NetSalary = netSalary;
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(Integer hour) {
		this.Hour = hour;
	}

	public Integer getXtraHours() {
		return xtraHours;
	}

	public void setXtraHours(Integer xtraHours) {
		this.xtraHours = xtraHours;
	}

	public Integer getTar() {
		return Tar;
	}

	public void setTar(Integer tar) {
		Tar = tar;
	}

	public Integer getXtraTar() {
		return xtraTar;
	}

	public void setXtraTar(Integer xtraTar) {
		this.xtraTar = xtraTar;
	}
	
	
	public Integer getBruteWage() {
		return BruteWage;
	}

	public void setBruteWage(Integer bruteWage) {
		BruteWage = bruteWage;
	}
	
	

	public Double getNetSalary() {
		return NetSalary;
	}

	public void setNetSalary(Double netSalary) {
		NetSalary = netSalary;
	}

	
	
	public void showData () {
	
		System.out.printf("||#%s||%s %s||%s %s||\n||", 
				getId(),
				getFirstName(),
				getSecondName(),
				getFisrtLname(),
				getSecondLname()
				);
				System.out.printf("\n||Horas = \033[33m%s\u001B[0m \n||Tarifa = \033[33m%s \u001B[0m \n||Horas Extra = \033[32m%s\u001B[0m \n||Tarifa Extra = \033[32m%s\u001B[0m \n||Salario Minimo = \033[33m%s\u001B[0m \n||INSS = \033[33m%s\u001B[0m \n||IR = \033[33m%s\u001B[0m \n||Total Deducciones = \033[33m%s\u001B[0m \n||Salario Neto = \033[32m%s \u001B[0m" ,
				getHour(), 
				getTar(), 
				getXtraHours(),
				getXtraTar(), 
				getBruteWage(), 
				getINSS(),
				getIr(),
				getToDedud(),
				getNetSalary()
				);
		
	}
	

}
