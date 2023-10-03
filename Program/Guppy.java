//03-10-2023
package oops3;
public class Guppy {
	static int a;
	static { 	//static block 1
		a=10;
	}
	static { 	//static block 2
		a=20;
	}
	public static void main(String[] args) {
		System.out.println("Main method Start");	
		System.out.println("Value of A is"+a);
		//last static block data is added
		System.out.println("Main method End");		
	}
	static { 	//static block 3
		a=55;
	}
	static { 	//static block 4
		a=77;
	}
}
//o/p
//Main method Start
//Value of A is77
//Main method End