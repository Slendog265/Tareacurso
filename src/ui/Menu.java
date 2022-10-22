 package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bll.PMenu;
import dal.employeesDal;
import dol.hourEmployee;
import misc.dedudCalc;

public final class Menu {
	private Scanner entry;
	private List<hourEmployee> hEmp;
	
	//Scanner entry = new Scanner(System.in);
	
	
	
	public Menu(Scanner entry) {
		super();
		this.entry = entry;
	}
	public Menu(List<hourEmployee> hEmp) {
		super();
		this.hEmp = hEmp;
	}
	/**public Menu(Scanner scan, List<hourEmployee> hEmp) {
		super();
		entry = new Scanner(System.in);
		hEmp = new ArrayList<hourEmployee>();
	}**/
	public void ShowOp() {
	    System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|\033[36m1.\u001B[0mAgregar Empleado por Hora                      |\n|\033[36m2.\u001B[0mMostrar Empleado por Hora                      |\n|\033[36m3.\u001B[0mSalir                                          |");
		System.out.println("\033[35m===================================================\u001B[0m");
	}
	public void show() {
		PMenu z = new PMenu();
		short op1 = 0;
		do {
			ShowOp();
		
			op1 = entry.nextShort();
			
	switch(op1) {
			
			case 1:
				hEmp = new ArrayList<hourEmployee>();
				add();
				//calcH();
				break;
				
			case 2:
				save();
				break;
			case 3:
				open();
				break;
			case 4:
				z.options2();
				break;
				
				default:
					System.out.println("\033[35m===================================================\u001B[0m\n|\033[31mNumero Equivocado                                \u001B[0m|\n|\033[31mPor favor digite una de las tres opciones.       \u001B[0m|\033[35m \n===================================================\u001B[0m");
					System.out.println();
				
	}
		
		}while(op1 != 4 );
	}
	
	private void add() {
		addHourEmp em = new addHourEmp(entry);
		employeesDal ed = new employeesDal();
		ed.AddHoemp(em.hEmployee());
	}
	
	private void calcH() {
		addHourEmp em = new addHourEmp(entry);
		dedudCalc dc = new dedudCalc(null);
		em.calcDedud2();
		}
	
	private void save() {
		employeesDal ed = new employeesDal();
		
		System.out.println("Por favor indica la ruta del archivo: ");	
		ed.setFilePath(entry.next());
		System.out.println("Por favor indica el nombre del archivo: ");		
		ed.setFileName(entry.next());
		ed.setHEmp(hEmp);
		ed.saveList();
	}
	
	public void open() {
		System.out.println("Por favor indique la ruta del archivo para abrir ");
		String filepath = entry.next();
		employeesDal ed = new employeesDal();
		ed.setFilePath(filepath);
		hEmp = ed.openList();
		addHourEmp em = new addHourEmp(entry);
		ed.show();
	}
}
