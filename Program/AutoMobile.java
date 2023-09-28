28-09-2023
package oops3;
class Benz{
	//Constructor name should be same as class name
	
	//constructor
	Benz(){
		System.out.println("Inisde Benz Constructor");
	}
}
public class AutoMobile {
	public static void main(String[] args) {
		Benz b1=new Benz();
		Benz b2=new Benz();
	}
}
//o/p
//Inisde Benz Constructor
//Inisde Benz Constructor
