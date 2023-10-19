//19-10-2023
package oops5;
class Bahubali{
	void golmaal(){
		System.out.println("No parameter Method.");
	}
	void golmaal(int a) {
		System.out.println(a+" 1 int parameter method");
	}
	void golmaal(int a,int b) {
		System.out.println(a+" "+b+" 2 int parameter method");
	}
	void golmaal(double a,int b) {
		System.out.println(a+" "+b+" 2 int parameter method");
	}
	void golmaal(int a, int b,double c) {
		System.out.println(a+" "+b+" "+c+" 3 int and double parameter method");
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Bahubali b1=new Bahubali();
		b1.golmaal();
		b1.golmaal(10);
		b1.golmaal(79,89);
		b1.golmaal(45.7,47);
		b1.golmaal(75,27,77.42);
	}
}
//o/p
//No parameter Method.
//10 1 int parameter method
//79 89 2 int parameter method
//45.7 47 2 int parameter method
//75 27 77.42 3 int and double parameter method