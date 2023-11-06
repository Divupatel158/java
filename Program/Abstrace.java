//06-11-2023
package oop6;
abstract class Swarg {//0 abstract class0000000000000000000
	void urvashi() {//concrete method
		System.out.println("Inside urvashi() of ewarg class");
	}
	//abstract class can have both concrete methods and abstract methods
	abstract void rambha();//Abstract class
	abstract void menka();//Abstract class
}
class indra extends Swarg{
	//When a class extends abstract method it should override and give the
	//implementation for all the abstract method
	@Override
	void rambha() {
		System.out.println("rambha () implementation ");
	}
	@Override
	void menka() {
		System.out.println("menka () implementation ");
	}
}
public class Abstrace {
	public static void main(String[] args) {
		// Swarg s1=new Swarg();
		// we can not create object with the abstract class
		indra i1=new indra();
		i1.menka();
		i1.rambha();
		i1.urvashi();
	}
}
//o/p
//menka () implementation 
//rambha () implementation 
//Inside urvashi() of ewarg class