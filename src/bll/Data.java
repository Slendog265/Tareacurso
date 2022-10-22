package bll;

import java.util.Scanner;

import dal.Pp;
import dol.hourEmployee;
import dol.monthEmployee;
import ui.addEmployee;
import ui.addHourEmp;

public final class Data {

	public static Pp G = new Pp();
	private static Scanner entry;
	public static void addHoEmp (hourEmployee m ) {
		G.addHoEmp(m);
	} 
	public static void catchHEmployee() {
		//addHourEmp em = new addHourEmp();
		//addHoEmp(em.HEmployee());
	}
	
	public static void addMoEmp(monthEmployee f) {
		G.addMEmp(f);
	}
	
	public static void catchMEmployee() {
		addEmployee me = new addEmployee(entry);
		addMoEmp(me.MEmployee());
	}
	
	public static void showDataHEmployee() {
		G.showData();
	}
	
	public static void ShowDataMEmp() {
		G.showData2();
	}
}
