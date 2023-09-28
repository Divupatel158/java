//28-09-2023
package oops3;
class Fortuner{
	int a;			// non static global variable
	String color;
	double price;	
	Fortuner(int i,String j,double k){	//i,j,k is local variable
		a=i;		
		color=j;
		price=k;
	}
}
public class AutoMobileRunner {
	public static void main(String[] args) {
		Fortuner f1=new Fortuner(2,"black",25.5);
		System.out.println("car number is "+f1.a);
		System.out.println("car's color is "+f1.color);
		System.out.println("car's price is "+f1.price);
		System.out.println("-----------");
		Fortuner f2=new Fortuner(50,"Red",36.7);
		System.out.println("car number is "+f2.a);
		System.out.println("car's color is "+f2.color);
		System.out.println("car's price is "+f2.price);
	}
}
//o/p
//car number is 2
//car's color is black
//car's price is 25.5
//-----------
//car number is 50
//car's color is Red
//car's price is 36.7