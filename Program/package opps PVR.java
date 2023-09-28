package opps;
public class PVR {
	public static void main(String[] args) {
		System.out.println(Padmavat.h1);
		Padmavat.h1="Priyanka";
		//static variables are not constant, we can modify it 
		System.out.println(Padmavat.h1);
		System.out.println("......................");
		System.out.println(Padmavat.a1);
		Padmavat.a1=50;
		System.out.println(Padmavat.a1);	
	}
}