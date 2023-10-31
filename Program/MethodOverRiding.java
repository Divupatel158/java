//20-10-2023
package oops5;
class Jethalal{
	void work() {
		System.out.println("Jethalal gada electronic ka owner he");
	}
}
class Tappu extends Jethalal{
	void work() {
		System.out.println("Tappu ne gada electronics bech diya");
	}
}
public class MethodOverRiding {
	public static void main(String[] args) {
		Jethalal j1=new Jethalal();
		Tappu t1=new Tappu();
		j1.work();
		t1.work();
	}
}
//o/p
//Jethalal gada electronic ka owner he
//Tappu ne gada electronics bech diya