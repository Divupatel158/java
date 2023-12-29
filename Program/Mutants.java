package oops7;
public class Mutants {
	public static void main(String[] args) {
		String s1=new String("Java");
		System.out.println(s1);
		s1.concat("Program");
		System.out.println(s1);
		System.out.println("--------");
		String s2=new String("Good");
		System.out.println(s2);
		s2=s2.concat("Morning");
		System.out.println(s2);
		System.out.println("---------");
		StringBuffer s3=new StringBuffer("Marvel1");
		System.out.println(s3);
		s3.append("Universol");
		System.out.println(s3);
		System.out.println("---------");
		StringBuilder s4=new StringBuilder("Bhulh");
		System.out.println(s4);
		s4.append("Lagihae");
		System.out.println(s4);
		s4.append("Jane do");
		System.out.println(s4);
	}
}
//o/p
//Java
//Java
//--------
//Good
//GoodMorning
//---------
//Marvel1
//Marvel1Universol
//---------
//Bhulh
//BhulhLagihae
//BhulhLagihaeJane do
