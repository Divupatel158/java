//11-10-2023
package oops5;
//1) public class
public class Student {
	//2) private attributes
	private String name;
	private double cgpa;
	private int age;
	//3)public constructor
	public Student(String name, double cgpa, int age) {
		this.name = name;
		this.cgpa = cgpa;
		this.age = age;
	}
	//4) public getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}