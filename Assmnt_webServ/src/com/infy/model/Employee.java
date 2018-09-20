package com.infy.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String eid;
	private String ename;
	private int esalary;
	private String edesignation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eid, String ename, int esalary, String edesignation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.edesignation = edesignation;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edesignation=" + edesignation
				+ "]";
	}
	
}
