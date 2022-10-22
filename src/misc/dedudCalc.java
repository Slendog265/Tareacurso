package misc;

import java.util.List;
import java.util.Scanner;

import dol.hourEmployee;
import dol.monthEmployee;
import ui.addHourEmp;

public class dedudCalc  {
	private hourEmployee m;
	
	
	
	public dedudCalc() {
		super();
	}

	public dedudCalc(hourEmployee m) {
		super();
		this.m = m;
	}

	monthEmployee f = new monthEmployee();
	

	public hourEmployee calcDedud1() {
		Integer Tarifa = m.getTar();
		Integer Horas = m.getHour();
		Integer Total1 = Horas * Tarifa;
		m.setBruteWage(Total1);	
		double numb = Total1;
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		m.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999.50  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			m.setIr(IrM);
			  Dedud = INSS +IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	m.setNetSalary(netSalry);
		}else if(SAnual < 349999.50 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}else if(SAnual  < 499999.50 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			   m.setNetSalary(netSalry);
		}else if(SAnual > 500000.50) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS  + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);

		}
		return m;		
		
	}
	
	public hourEmployee calcDedud2() {
		Integer Tarifa = m.getTar();
		Integer Horas = m.getHour();
		Integer Total1 = Horas * Tarifa;
		Integer Xtarifa = m.getXtraTar();
		Integer XHora = m.getXtraHours();
		Integer Total2 = XHora * Xtarifa;
		Integer Brute = Total1 + Total2;
		m.setBruteWage(Brute);
		double numb = Total1;
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		m.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999.50  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			m.setIr(IrM);
			  Dedud = INSS +IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	m.setNetSalary(netSalry);
		}else if(SAnual < 349999.50 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}else if(SAnual  < 499999.50 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			  m.setNetSalary(netSalry);
		}else if(SAnual > 500000.50) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 m.setIr(IrM);
			  Dedud = INSS  + IrM;
				m.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    m.setNetSalary(netSalry);
		}
		return m;
		
	}
	
public monthEmployee dedudCalc0 () {
		
		double numb = f.getMinimumWage();
		double SmD = 0, IrM = 0, pApli = 0,Dedud = 0, netSalry = 0, IA = 0;
		double INSS = numb * 0.07;
		
		f.setINSS(INSS);
		double BImpo = numb - INSS;
		double SAnual = BImpo * 12;
		if(SAnual <  199999  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			f.setIr(IrM);
			  Dedud = INSS +IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
	f.setNetSalary(netSalry);
		}else if(SAnual < 349999 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    f.setNetSalary(netSalry);
		}else if(SAnual  < 499999 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			   f.setNetSalary(netSalry);
		}else if(SAnual > 500000) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			 f.setIr(IrM);
			  Dedud = INSS  + IrM;
				f.setToDedud(Dedud);
			     netSalry = numb -Dedud;
			    f.setNetSalary(netSalry);

		}
		
		
		return f;
	    
		
		
		
	}
}
