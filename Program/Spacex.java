//10-10-2023
//Java bean class--> Example for Encapsulation
package oops4box;
//1 public class 
public class Spacex {
	//2 private variables/attributes
	private int eid;
	private String name;
	private double salary;
	//3 public constructor
	public Spacex(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	//4 public getter and setter methods 
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}