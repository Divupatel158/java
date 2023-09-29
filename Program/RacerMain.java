//29-09-2023
package oops3;
class Ferrari{
	int num=5643;
	double price=30.56;
	String color="NeonGray";
	void features() {
		System.out.println("Number of car is "+num);
		System.out.println("Price of car is "+price);
		System.out.println("Color of car is "+color);
	}
	//constructor
	public Ferrari(int num, double price, String color) {
		super();
		this.num = num;
		this.price = price;
		this.color = color;
		//This keyword is used to refer the current object
	}
}
public class RacerMain {
	public static void main(String[] args) {
		Ferrari f1=new Ferrari(1234,43.55,"NeonGray");
		f1.features();
		System.out.println("-----------------------");
		Ferrari f2=new Ferrari(5678,32.55,"AquaRed");
		f2.features();
	}
}
//o/p
//Number of car is 1234
//Price of car is 43.55
//Color of car is NeonGray
//-----------------------
//Number of car is 5678
//Price of car is 32.55
//Color of car is AquaRed
