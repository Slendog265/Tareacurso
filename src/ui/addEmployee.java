package ui;

import java.util.Scanner;

import dol.monthEmployee;
import misc.dedudCalc;

public class addEmployee {
	

	monthEmployee f = new monthEmployee();
	//dedudCalc e = new dedudCalc(entry);
	Scanner entry = new Scanner(System.in);
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
				
				
	
	
	
		return f;
	}
	
		
	
	
	}
	
	
