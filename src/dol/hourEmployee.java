package dol;

import java.io.Serializable;

public class hourEmployee extends Person implements Serializable {
	
	private int Hour;
	private int xtraHours;
	private int Tar;
	private int xtraTar;
	private int BruteWage;
	private double NetSalary;
	
	
	
	public hourEmployee() {
		
	}


	public hourEmployee(String firstName, String secondName, String fisrtLname, String secondLname, String id,
			Double iNSS, Double ir, Double toDedud, int hour, int xtraHours, int tar, int xtraTar,
			int bruteWage, Double netSalary) {
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

	public void setHour(int hour) {
		this.Hour = hour;
	}

	public int getXtraHours() {
		return xtraHours;
	}

	public void setXtraHours(int xtraHours) {
		this.xtraHours = xtraHours;
	}

	public int getTar() {
		return Tar;
	}

	public void setTar(int tar) {
		Tar = tar;
	}

	public int getXtraTar() {
		return xtraTar;
	}

	public void setXtraTar(int xtraTar) {
		this.xtraTar = xtraTar;
	}
	
	
	public int getBruteWage() {
		return BruteWage;
	}

	public void setBruteWage(int bruteWage) {
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
