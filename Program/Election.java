//09-10-2023 
package oops4box;
// accessing variables and methods in different class same package
public class Election {
	public static void main(String[] args) {
		System.out.println("main Start of election");
		Voting M1=new Voting();
		System.out.println(M1.a);
		System.out.println(M1.b);
		System.out.println(M1.c);
		//System.out.println(M1.d);		because it is private attribute
		M1.mock1();
		M1.mock2();
		M1.mock3();
		//M1.mock4();	as it is private access method
		System.out.println("main End of election");
	}
}
//o/p
//main Start of election
//10
//20
//30
//Inside public access method 1
//Inside protected access method 2
//Inside default access method 3
//main End of election