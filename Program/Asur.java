//03-10-2023
package oops3;
public class Asur {
	static String name;	//static global variable
	static int gfage;
	static {
		name="Aliya";
		gfage=47;
	}
	static {
		name="Sofia";
		gfage=59;
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("Sameer's Current gf Name is"+name);
		gfage=19;
		System.out.println("Age is "+gfage);
		System.out.println("Main end");
	}
	static {
		name="Tanya";
		gfage=21;
	}
}
//o/p
//Main start
//Sameer's Current gf Name isTanya
//Age is 19
//Main end
