//13-10-2023
package oops5;
class YourSibling{
	//constructor
	YourSibling(){
		System.out.println("Inside Sibling constructor");
	}
}
class you extends YourSibling{
	//constructor
	you(){
	System.out.println("inside your constructor");	
	}
}
public class ImpliciteConstructorclall {
	public static void main(String[] args) {
		you y1=new you();
	}
}
//o/p
//Inside Sibling constructor
//inside your constructor