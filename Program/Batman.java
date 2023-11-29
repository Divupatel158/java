//27-11-2023
package oops7;
//before overrideing equals()
public class Batman {
	int age;	//global non static variable
	//constructor 
	Batman(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		Batman b1=new Batman(10);
		Batman b2=new Batman(10);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);	
	}
}
//o/p
//false
//false
/*
 note: By default equals () compares the address or reference 
 of two Object by order to compare the content or data two object
 we have to override equals()
*/