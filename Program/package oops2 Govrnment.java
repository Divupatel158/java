package oops2;
class India{
	static int i=23;// global static variable
		   int j=56;// global non static variable
	static void gujarat() {
	String name= "Ahmedabad";//local variable
	int ab=92;//local variable
	System.out.println(name);
	System.out.println(ab);
	}
}
public class Government {
	public static void main(String[] args) {
		System.out.println(India.i);
	}
}