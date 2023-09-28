package opps;
class Zendya{		
	static int a=10;//static variable	
	static void test() { //static method
		System.out.println("Zendya flying ...");
	}
}
public class Spiderman {
	public static void main(String[] args) {
		System.out.println("P S");					   //Classname.staticvariablename
		System.out.println(Zendya.a);//accessing static variable in another class
		//Classname.staticmethodname
		Zendya.test(); // accessing static method from another class
		System.out.println("P E");
	}
}