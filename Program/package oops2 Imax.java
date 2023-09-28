package oops2;
class IronMan{
	static int a=3000; //s.variable
		   int b=2250; //non s.variable	   
	static void stark() { //s.method
		System.out.println("Stark Industries");
	}
		void steve() { //non s.method
			System.out.println("hey...Cap");
		}
}
class BatMan{
	static int m=50; //s. variable
		   int n=20; // non s. variable
	static void bruce() {
		System.out.println(" I am BatMan .....");
	}
	void joker() {
		System.out.println(" y so serious.....");
	}
}
public class Imax {
	public static void main(String[] args) {
		System.out.println(" P Start");
		System.out.println();
		System.out.println(IronMan.a);
		System.out.println(new IronMan().b);
		IronMan.stark();
		new IronMan().steve();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println(BatMan.m);
		System.out.println(new BatMan().n);
		BatMan.bruce();
		new BatMan().joker();
		System.out.println();
		System.out.println(" P End");
	}
}