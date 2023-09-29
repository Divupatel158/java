//29-09-2023
package oops3;
import java.util.Scanner;
class Challenger{
	int num;
	double price;
	String color;
	public Challenger(int num, double price, String color) {
		this.num = num;
		this.price = price;
		this.color = color;
	}
	void display() {
		System.out.println("Car Details   "+num+"   "+price+"   "+color);
	}
}
public class MountainRider {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car number");
		int n=sc.nextInt();
		System.out.println("Enter the car price");
		double d=sc.nextDouble();
		System.out.println("Enter the car color");
		String c=sc.next();
		Challenger c1=new Challenger(n,d,c);
		c1.display();
	}
}
//o/p
//Enter the car number
//5
//Enter the car price
//20.52
//Enter the car color
//black
//Car Details   5   20.52   black