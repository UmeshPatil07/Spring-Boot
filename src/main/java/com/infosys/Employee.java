package com.infosys;

import org.springframework.stereotype.Component;

@Component(value=("E"))
public class Employee {
	private int eId;
	private String desg;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String desg) {
		super();
		this.eId = eId;
		this.desg = desg;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", desg=" + desg + "]";
	}
	
	
	

}
