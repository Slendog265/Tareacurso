package ui;

import java.util.List;
import java.util.Scanner;

import dol.hourEmployee;
import dol.monthEmployee;
import misc.dedudCalc;

public class addEmployee {
	

	private Scanner entry;
	private monthEmployee mE;
	private List<monthEmployee> mEmp;
	
	
	public addEmployee(Scanner entry) {
		super();
		this.entry = entry;
	}
	
	public addEmployee(monthEmployee mE) {
		super();
		this.mE = mE;
	}

	public addEmployee(List<monthEmployee> mEmp) {
		super();
		this.mEmp = mEmp;
	}

	
	monthEmployee f = new monthEmployee();
	

	public monthEmployee MEmployee() {
		
		System.out.println("\033[35m=====================================\u001B[0m\n||         Id del Empleado         ||");
		f.setId(entry.next());
		System.out.println("||   Primer Nombre del Empleado    ||");
		f.setFirstName(entry.next());
		System.out.println("||   Segundo Nombre del Empleado   ||");
		f.setSecondName(entry.next());
		System.out.println("||  Primer Apellido del Empleado   ||");
		f.setFisrtLname(entry.next());
		System.out.println("||  Segundo Apellido del Empleado  ||");
		f.setSecondLname(entry.next());
		System.out.println("||         Salario  Minimo         ||");			
				f.setMinimumWage(entry.nextDouble());
				dedudCalc e = new dedudCalc(f);
				e.dedudCalc0();

				
	
	
	
		return f;
	}
	
		
	
	
	}
	
	
