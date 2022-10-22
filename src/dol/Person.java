package dol;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String firstName;
	private String secondName;
	private String fisrtLname;
	private String secondLname;
	private String Id;
	private Double INSS;
	private Double Ir;
	private Double ToDedud;

	public Person() {
		super();
	}

	public Person(String firstName, String secondName, String fisrtLname, String secondLname, String id, Double iNSS, Double ir, Double toDedud) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.fisrtLname = fisrtLname;
		this.secondLname = secondLname;
		this.Id = id;
		this.INSS = iNSS;
		this.Ir = ir;
		this.ToDedud = toDedud;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFisrtLname() {
		return fisrtLname;
	}

	public void setFisrtLname(String fisrtLname) {
		this.fisrtLname = fisrtLname;
	}

	public String getSecondLname() {
		return secondLname;
	}

	public void setSecondLname(String secondLname) {
		this.secondLname = secondLname;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Double getINSS() {
		return INSS;
	}

	public void setINSS(Double iNSS) {
		INSS = iNSS;
	}

	public Double getIr() {
		return Ir;
	}

	public void setIr(Double ir) {
		Ir = ir;
	}

	public Double getToDedud() {
		return ToDedud;
	}

	public void setToDedud(Double toDedud) {
		ToDedud = toDedud;
	}

}