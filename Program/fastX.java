package oops2;
public class FastX {// inside same class
	static int p=420;//global static variable
		int q=786;//global non static variable
	public static void main(String[] args) {
		System.out.println(FastX.p);
		System.out.println(p);//we can call directly inside same class
		// we can call static variable inside same class directly
		System.out.println(new FastX().q);
	}
}