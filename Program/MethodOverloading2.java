//19-10-2023
package oops5;
class calculator{
	void sum(int a,int b) {
		int res =a+b;
		System.out.println("Sum is : "+res);
	}
	void sum(int a,int b,int c) {
		int res=a+b+c;
		System.out.println("sum is : "+res);
	}
	void sum(double a, double b) {
		double res= a+b;
		System.out.println("res is : "+ res);
	}
	int square(int a) {
		return a*a;
	}
	double square(double d) {
		return d*d;
	}
}
public class MethodOverloading2 {
	public static void main(String[] args) {
		calculator c1=new calculator();
		c1.sum(11,72);
		c1.sum(10,741,72);
		c1.sum(72.4,14.85);
		System.out.println("square of num is : "+c1.square(7));
		System.out.println("Square of double num is : "+c1.square(72.4));
	}
}
//o/p
//Sum is : 83
//sum is : 823
//res is : 87.25
//square of num is : 49
//Square of double num is : 5241.760000000001