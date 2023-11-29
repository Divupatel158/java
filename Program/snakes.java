//25-11-2023
package oops7;
class kurkure{
	int a=10;
	int b=20;
	int c=30;
	public kurkure(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String toString()
	{
		return "kurkure"+"a="+a+"b="+b+"c="+c;
	}
}
public class snakes {
	public static void main(String[] args) {
		kurkure k1=new kurkure(10,20,30);
		System.out.println(k1);//oops7.kurkure@4517d9a3
		System.out.println("--------");
		kurkure k2=new kurkure(20,30,40);
		System.out.println(k2);//oops7.kurkure@372f7a8d
	}
}
//o/p
//kurkurea=10b=20c=30
//--------
//kurkurea=20b=30c=40
