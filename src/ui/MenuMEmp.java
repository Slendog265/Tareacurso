package ui;import java.util.ArrayList;import java.util.List;import java.util.Scanner;import bll.PMenu;import dal.employeesDal;import dol.hourEmployee;import dol.monthEmployee;import misc.dedudCalc;public class MenuMEmp {	private Scanner entry;	private List<monthEmployee> mEmp;				public MenuMEmp(Scanner entry,List<monthEmployee> mEmp) {		super();		this.entry = entry;		this.mEmp = mEmp;	}	/**public MenuMEmp(List<monthEmployee> mEmp) {		super();		this.mEmp = mEmp;	}**/	public void ShowOp2 () {		System.out.println("\033[35m===================================================\u001B[0m");		System.out.println("|\033[36m1.\u001B[0mAgregar Empleado Mensual                       |\n|\033[36m2.\u001B[0mGuardar Empleado Mensual                       |\n|\033[36m3.\u001B[0mAbrir Empleado Mensual                                          |\n|\033[36m4.\u001B[0mSalir                                          |");		System.out.println("\033[35m===================================================\u001B[0m");			}	public void show2() {			short op2 = 0;		boolean error = false;	do {		ShowOp2();		//try {	op2 = entry.nextShort();	switch(op2) {		case 1:		//mEmp = new ArrayList<monthEmployee>();		add();		break;			case 2:		save();		break;	case 3:		open();		break;	case 4:		PMenu z = new PMenu();		z.options2();		default:			System.out.println("\033[35m===================================================\u001B[0m\n|\033[31mNumero Equivocado                                \u001B[0m|\n|\033[31mPor favor digite una de las tres opciones.       \u001B[0m|\033[35m \n===================================================\u001B[0m");			System.out.println();						}		/**}catch(InputMismatchException  e){						System.out.println("\033[31mIntroduce un valor numerico.\u001B[0m");			System.out.println();			error = true;			if(error = true) {				show2();			}		}**/	}while(op2 != 3);		}	private void add() {	addEmployee mm = new addEmployee(entry);	dedudCalc d = new dedudCalc();	mEmp.add(mm.MEmployee());}private void save() {	employeesDal ed = new employeesDal();		System.out.println("Por favor indica la ruta del archivo: ");		ed.setFilePath(entry.next());	System.out.println("Por favor indica el nombre del archivo: ");			ed.setFileName(entry.next());	ed.setmEmp(mEmp);	ed.saveList1();}public void open() {	employeesDal ed = new employeesDal();	System.out.println("Por favor indique la ruta del archivo para abrir ");	String filepath = entry.next();	ed.setFilePath(filepath);	System.out.println("Por favor indique el nombre del archivo para abrir ");	String filename = entry.next();	ed.setFileName(filename);	mEmp = ed.openList1();	ed.setmEmp(mEmp);	addEmployee em = new addEmployee(mEmp);	em.show();}}