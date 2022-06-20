package com.infosys;

import org.springframework.stereotype.Component;

@Component(value="S")
public class Student {
	
	private String sName;
    private String addr;
	
    public Student() {
		super();
	}

	public Student(String sName, String addr) {
		super();
		this.sName = sName;
		this.addr = addr;
	}

	public String getsName() {
		System.out.println("Umesh");
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", addr=" + addr + "]";
	}
    
    
    

}
