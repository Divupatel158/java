//17-10-2023
package oops5;
//Constructor chaining
class DesiKalakar{
	DesiKalakar(){
		System.out.println("1 inside Desi kalakar class constructor");
	}
}
class BrownRang extends DesiKalakar{
	int a;
	int b;
	public BrownRang(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("2 Inside BrownRang class constructor");
	}	
}
class BlueEyes extends BrownRang{
	int c;
	int d;
	public BlueEyes(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
		System.out.println("3 inside blueEyes class constructor");
	}	
}
public class YOYOHoneySingh {
	public static void main(String[] args) {
		BlueEyes b1=new BlueEyes(10,20,30,40);
	}
}
//o/p
//1 inside Desi kalakar class constructor
//2 Inside BrownRang class constructor
//3 inside blueEyes class constructor