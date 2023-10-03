//03-10-2023
package oops3;
public class HappyPizza {
	int price=699;	//non static variable
	void hungry() {		//non static method
		int price=299;	//local variable
		System.out.println(price+" local variable");
		System.out.println(this.price+" global variable");
		System.out.println(this);	//holds address
	}
	public static void main(String[] args) {
		System.out.println("m s");
		HappyPizza h1=new HappyPizza();
		h1.hungry();
		System.out.println("------------");
		HappyPizza h2=new HappyPizza();
		h2.hungry();
		System.out.println("m e");
	}
}
//o/p
//m s
//299 local variable
//699 global variable
//oops3.HappyPizza@24d46ca6
//------------
//299 local variable
//699 global variable
//oops3.HappyPizza@4517d9a3
//m e
