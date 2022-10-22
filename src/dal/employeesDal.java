package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dol.hourEmployee;
import dol.monthEmployee;



public final class employeesDal {

	
		
	    private List<hourEmployee> hEmp;
	    private List<monthEmployee> mEmp;
	    private String filePath;
		private String fileName;
		
		
		public employeesDal() {
			hEmp = new ArrayList<hourEmployee>();
			mEmp = new ArrayList<monthEmployee>();
		}
		
		public employeesDal(List<hourEmployee> hEmp, List<monthEmployee> mEmp, String filePath, String fileName) {
			super();
			this.hEmp = hEmp;
			this.mEmp = mEmp;
			this.filePath = filePath;
			this.fileName = fileName;
		}



		public List<hourEmployee> getHEmp() {
			return hEmp;
		}
		public void setHEmp(List<hourEmployee> hEmp) {
			this.hEmp = hEmp;
		}
		public String getFilePath() {
			return filePath;
		}
		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public void AddHoemp (hourEmployee m) {
			this.hEmp.add(m);
			}
		
		
		public void saveList() {
			
			File file = new File(filePath + "\\" + fileName);
			try {
				
				ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
				os.writeObject(hEmp);
				os.flush();
				os.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public List<hourEmployee> openList() {
			File file = new File(filePath);
			try {
				ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
				List<hourEmployee> he = (List<hourEmployee>) o.readObject();
				o.close();
				return he;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public void show() {
			System.out.println("\033[35m===================================================\u001B[0m");
			System.out.println("|              Listado de Empleados               |");
			System.out.println("\033[35m===================================================\u001B[0m");
			for(int i=0; i<hEmp.size();i++) {
				hEmp.get(i).showData();
		    System.out.println("\n\033[35m===================================================\u001B[0m");
		   
		    
		    
			}
		}
		
}

