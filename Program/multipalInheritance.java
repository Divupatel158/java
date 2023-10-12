//12-10-2023
package oops5;
class Grandpa{
	void aaram() {
		System.out.println("Aaram() of Grandpa class");
	}
}
class Father1 extends Grandpa{
	//2 method
	//1 extended aaram() 
	//1 own method -- business()
	void business() {
		System.out.println("business() of Father1 class");
	}
}
class Son1 extends Father1{
	//3 method 
	//2 extended --aaram(), --business()
	//1 own method -- study()
	void Study() {
		System.out.println("study() of Son1 class");
	}
}
public class multipalInheritance {

	public static void main(String[] args) {
		Grandpa g1=new Grandpa();
		g1.aaram();
		System.out.println("--------------");
		Father1 f1=new Father1();
		f1.aaram();
		f1.business();
			//f1.study();
		System.out.println("--------------");
		Son1 s1=new Son1();
		s1.aaram();
		s1.business();
		s1.Study();
	}
}
//o/p
//Aaram() of Grandpa class
//--------------
//Aaram() of Grandpa class
//business() of Father1 class
//--------------
//Aaram() of Grandpa class
//business() of Father1 class
//study() of Son1 class
