//14-10-2023
package oops5;
class ironman extends Object{
	ironman(int a){
		System.out.println(a+" Inside ironman class constructor");
	}
}
class thor extends ironman{
	thor(double d){
		super(10);
		System.out.println(d+" Inside thor class constructor");
	}
}
class wandavision extends thor{
	wandavision(String s){
		super(8.75);
		System.out.println(s+" Inside of wandavision class constructor");
	}
}
public class Useofsuper {

	public static void main(String[] args) {
		System.out.println("Main start");
		wandavision w1=new wandavision("Divu");
		
		System.out.println("Main End");
	}

}
//o/p
//Main start
//10 Inside ironman class constructor
//8.75 Inside thor class constructor
//Divu Inside of wandavision class constructor
//Main End
