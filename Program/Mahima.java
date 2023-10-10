//05-10-2023
package oops3;
public class Mahima {
	final static double pi=3.142;	//non static global variable 
	public static void main(String[] args) {
		System.out.println(pi);
		//pi=6.54;		we can't reinitilize final variable
		System.out.println(pi);
	}
}
//o/p
//3.142
//3.142