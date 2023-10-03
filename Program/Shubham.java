//03-10-2023
package oops3;
public class Shubham {
	static String name;	//static global variable
	int age;	//non static variable 
	{	//non static block
		age=29;
	}
	static {	//static block
		name="Rupali";
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("Name is "+name);
		Shubham s1=new Shubham();
		s1.age=20;
		System.out.println("age is "+s1.age);
		System.out.println("Main end");
	}
	static {	//static block 2
		name="pooja";
	}
	{	//non static block 2
		age=27;
	}
	static {	//static block 3
		name="Sweta";
	}	
}
//o/p
//Main start
//Name is Sweta
//age is 20
//Main end