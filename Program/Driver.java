//26-09-2023
package oops3;
class lambo{
	String color="red";
	double price= 200.00;
	void race() {
		System.out.println("Long drive pe le jau tuje ");
	}
}
public class Driver {
	public static void main(String[] args) {
		//reference variable holds the address of an objects
		//before
		lambo l1=new lambo();
		lambo l2=new lambo();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println();
		System.out.println("before ");
		System.out.println("l1 object is "+l1.color);
		System.out.println("l1 object is "+l1.price);
		System.out.println("--------------------");
		System.out.println("l2 object is "+l2.color);
		System.out.println("l2 object is "+l2.price);
		//after
		l1.color="yellw";
		l2.price=160.00;
		System.out.println("after ");
		System.out.println("l1 object is "+l1.color);
		System.out.println("l1 object is "+l1.price);
		System.out.println("--------------------");
		System.out.println("l2 object is "+l2.color);
		System.out.println("l2 object is "+l2.price);
	}
}
// o/p:-
//oops3.lambo@4517d9a3
//oops3.lambo@372f7a8d
//
//before 
//l1 object is red
//l1 object is 200.0
//--------------------
//l2 object is red
//l2 object is 200.0
//after 
//l1 object is yellw
//l1 object is 200.0
//--------------------
//l2 object is red
//l2 object is 160.0
