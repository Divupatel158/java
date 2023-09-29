//29-09-2023
package oops3;
class Bugati{
	String model;
	String color;
	double price;
	//constructor
	Bugati(String m,String c, double p){
		model=m;
		color=c;
		price=p;
	}
	void display() {
		System.out.println("Model of Car is "+model);
		System.out.println("Color of Car is "+color);
		System.out.println("Price of Car is "+price);
	}
}
public class AutoMObileIndutry {
	public static void main(String[] args) {
		Bugati b1=new Bugati("X1","Blue",12.56);
		b1.display();
		System.out.println("------------------------");
		Bugati b2=new Bugati("m2","Copper",45.23);
		b2.display();
	}
}
//o/p
//Model of Car is X1
//Color of Car is Blue
//Price of Car is 12.56
//------------------------
//Model of Car is m2
//Color of Car is Copper
//Price of Car is 45.23