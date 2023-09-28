package oops2;
class tokyo{	
	int a =15;			//non static variable
	String name="Bunty";			//non static variable
	void gold() {			//non static method
		System.out.println("gold heist...");
	}
}
public class barlin {
	public static void main(String[] args) {
		System.out.println(new tokyo().a);
		System.out.println(new tokyo().name);
		new tokyo().gold();
	}

}
