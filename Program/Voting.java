//09-10-2023  1. accessing variables and methods in same class same package
package oops4box;
public class Voting {
	//attributes
	public int a=10;	//public access
	protected int b=20;	//protected
	int c=30;			//default --> pkg-level
	private int d=40;	//private
	public void mock1() {	//public method
		System.out.println("Inside public access method 1");
	}
	protected void mock2() {	//protected
		System.out.println("Inside protected access method 2");
	}
	 void mock3() {		//default
		System.out.println("Inside default access method 3");
	}
	private void mock4() {		//private
		System.out.println("Inside private access method 4");
	}
	public static void main(String[] args) {
		System.out.println("Main Start of voting");
		Voting v1=new Voting();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println(v1.c);
		System.out.println(v1.d);
		v1.mock1();
		v1.mock2();
		v1.mock3();
		v1.mock4();
		System.out.println("Main End of voting");
	}
}
//o/p
//Main Start of voting
//10
//20
//30
//40
//Inside public access method 1
//Inside protected access method 2
//Inside default access method 3
//Inside private access method 4
//Main End of voting