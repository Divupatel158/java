//05-10-2023
package oops3;
public class TCS {
	final int eid;
	String name;
	double salary;
	public TCS(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	void empdetails() {
		System.out.println("Employee id is "+eid);
		System.out.println("Employee name is "+name);
		System.out.println("Employee salary is "+salary);
	}
	public static void main(String[] args) {
		System.out.println("M S");
		TCS t1=new TCS(100,"shubham",100000);
		t1.empdetails();
		System.out.println("-----------------");
		//t1.eid=101;	we can't reinitalize final variable
		TCS t2=new TCS(101,"yash",90000);
		t2.empdetails();
		System.out.println("M E");
	}
}
//o/p
//M S
//Employee id is 100
//Employee name is shubham
//Employee salary is 100000.0
//-----------------
//Employee id is 101
//Employee name is yash
//Employee salary is 90000.0
//M E
