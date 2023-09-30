//30-09-2023
package oops3;
class Bharat{
	int x;	//not static global variable
	double y;
	//Constructor 1
	Bharat(){
	System.out.println("No parameter Constructor 1");	
	}
	//Constructor 2
	Bharat(int arg1){
		x=arg1;
		System.out.println("1 parameter Constructor 2");
	}
	//Constructor 3
	Bharat(double arg1){
		y=arg1;
		System.out.println("1 double parameter Constructor 3");
	}
	//Constructor 4
	Bharat(int arg1, double arg2){
		x=arg1;
		y=arg2;
		System.out.println("int, double parameter Constructor 4");
	}
	//Constructor 5
	Bharat(double a,int b){
		a=y;
		b=x;
		System.out.println("Double, Int parameter Constructor 5");
	}
}
public class WorldCup {
	public static void main(String[] args) {
		Bharat b1=new Bharat();
		Bharat b2=new Bharat(10);
		Bharat b3=new Bharat(76.8);
		Bharat b4=new Bharat(76,54.456);
		Bharat b5=new Bharat(76.45,74);
	}
}
//o/p
//No parameter Constructor 1
//1 parameter Constructor 2
//1 double parameter Constructor 3
//int, double parameter Constructor 4
//Double, Int parameter Constructor 5
