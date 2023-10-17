//17-10-2023
package oops5;
//explicit Constructor call , using Super calling statement
class Motu{
	int a;
	double b;
	int c;
	public Motu(int a, double b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}	
}
class Patalu extends Motu{
	int d;
	int e;
	Patalu(int a, double b, int c, int d, int e) {
		super(a, b, c);
		this.d = d;
		this.e = e;
	}
}
public class Durgapooja {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Patalu p1=new Patalu(1,7.7,29,39,49);
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p1.d);
		System.out.println(p1.e);
		System.out.println("Main end");
	}
}
//o/p
//Main Start
//1
//7.7
//29
//39
//49
//Main end