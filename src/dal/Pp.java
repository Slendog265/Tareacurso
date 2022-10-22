package dal;

import java.util.ArrayList;
import java.util.List;

import dol.hourEmployee;
import dol.monthEmployee;
import ui.Menu;
import ui.MenuMEmp;

public class Pp {

	private List<hourEmployee> HEmp;
	private List<monthEmployee> MEmp;
	//Menu q = new Menu();
	MenuMEmp w = new MenuMEmp(MEmp);
	
	public Pp() {
		HEmp = new ArrayList<hourEmployee>();
		MEmp = new ArrayList<monthEmployee>();
		
	}
	public Pp(List<hourEmployee> hEmp, List<monthEmployee> mEmp) {
		super();
		HEmp = hEmp;
		MEmp = mEmp;
	}
	public List<hourEmployee> getHEmp() {
		return HEmp;
	}
	public void setHEmp(List<hourEmployee> hEmp) {
		HEmp = hEmp;
	}
	public List<monthEmployee> getMEmp() {
		return MEmp;
	}
	public void setMEmp(List<monthEmployee> mEmp) {
		MEmp = mEmp;
	}
	public void addHoEmp (hourEmployee m) {
		this.HEmp.add(m);
	}
	public void addMEmp (monthEmployee f) {
		this.MEmp.add(f);
	}
	public void showData() {
		System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|              Listado de Empleados               |");
		System.out.println("\033[35m===================================================\u001B[0m");
		for(int i=0; i<HEmp.size();i++) {
			//System.out.println("|     ID      |\n|   Nombres   |\n|  Apellidos  |\n|    Horas    |\n|   Tarifa    |\n| Horas Extra |\n|Tarifa Extra |\n|Salario Bruto|\n|Salario Neto |");
			HEmp.get(i).showData();
	    System.out.println("\n\033[35m===================================================\u001B[0m");
	    //System.out.println();
	    
	    
		}
	}
	
	public void showData2() {
		
		System.out.println("\033[35m===================================================\u001B[0m");
		System.out.println("|              Listado de Empleados               |");
		System.out.println("\033[35m===================================================\u001B[0m");
		for(int i=0; i<MEmp.size();i++) {
			MEmp.get(i).showData2();
	    System.out.println();
	    System.out.println("\033[35m===================================================\u001B[0m");
	    //System.out.println();
	  
	    
		}
	}
	
}
