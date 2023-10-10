//09-10-2023
package oops5;
import oops4box.Voting;		//importing from another package
// accessing variables and methods in different class different package
public class Amitshah {
	public static void main(String[] args) {
		System.out.println("Main start of Amitshah");
		Voting n1=new Voting();
		System.out.println(n1.a);
//		System.out.println(n1.b);		only public is visible in different package
//		System.out.println(n1.c);
//		System.out.println(n1.d);
		n1.mock1();
//		n1.mock2();		only public is visible in different package
//		n1.mock3();
//		n1.mock4();
		System.out.println("Main end of Amitshah");
	}
}
//o/p
//Main start of Amitshah
//10
//Inside public access method 1
//Main end of Amitshah