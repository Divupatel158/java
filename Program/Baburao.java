//29-11-2023
package oops7;
public class Baburao {
	public static void main(String[] args) {
		String s="Software Engineer";
		System.out.println(s.length());//17
		System.out.println(s.toUpperCase());//SOFTWARE ENGINEER
		System.out.println(s.toLowerCase());//software engineer
		System.out.println(s.contains("Eng"));//true
		System.out.println(s.contains("ware"));//true
		System.out.println("----------");
		System.out.println(s.startsWith("soft"));//false
		System.out.println(s.startsWith("Soft"));//true
		System.out.println(s.endsWith("eer"));//true
		System.out.println(s.lastIndexOf("n"));//13
		System.out.println("----------");
		System.out.println(s.indexOf("e"));//7
		System.out.println(s.lastIndexOf("e"));//15
		System.out.println(s.indexOf("e",8));//14
		System.out.println(s.indexOf("E"));
		System.out.println("----------");		
		String s2="Divyang";
		String s3="Divyang";
		String s4="diVYanG";
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equals(s4));//false
		System.out.println(s2.equalsIgnoreCase(s4));//true
	}
}