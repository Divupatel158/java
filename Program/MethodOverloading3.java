//19-10-2023
// Can we overload main method?
// -> yes we can 
package oops5;
public class MethodOverloading3 {
	public static void main(String[] args) {
		System.out.println("Main String start");
		System.out.println("Main String end");
	}
	public static void main(double[] args) {
		System.out.println("Main double start");
		System.out.println("Main double end");
	}
	public static void main(int[] args) {
		System.out.println("Main int start");
		System.out.println("Main int end");
	}
}
//o/p
//Main String start
//Main String end