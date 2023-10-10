//05-10-2023
package oops3;
public class Infosys {
	final int eid;
	String name;
	double salary;
	private static int randomnum=100;
	public Infosys(String name, double salary) {
		this.eid = randomnum++;
		this.name = name;
		this.salary = salary;
	}
	void details() {
		System.out.println("employee id is "+eid+ "name is "+name+
				" salary is "+salary);
	}
	public static void main(String[] args) {
		System.out.println("M S");
		Infosys i1=new Infosys("bhaskar",50000);
		i1.details();
		System.out.println("---------------");
		Infosys i2=new Infosys("ansun",90000);
		i2.details();
		System.out.println("---------------");
		Infosys i3=new Infosys("ronak",99000);
		i3.details();
		System.out.println("---------------");
		Infosys i4=new Infosys("Divu",100000);
		i4.details();
		System.out.println("---------------");
		Infosys i5=new Infosys("naisargi",40000);
		i5.details();
		System.out.println("M E");
	}
}
//o/p
//M S
//employee id is 100name is bhaskar salary is 50000.0
//---------------
//employee id is 101name is ansun salary is 90000.0
//---------------
//employee id is 102name is ronak salary is 99000.0
//---------------
//employee id is 103name is Divu salary is 100000.0
//---------------
//employee id is 104name is naisargi salary is 40000.0
//M E