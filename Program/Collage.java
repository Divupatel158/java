//11-10-2023
package oops5;
public class Collage {
	public static void main(String[] args) {
		Student s1=new Student("Divu",8.55,23);
		System.out.println(s1.getAge());
		System.out.println(s1.getCgpa());
		System.out.println("---------------");
		s1.setCgpa(8.73);
		System.out.println(s1.getCgpa());
		System.out.println();
		System.out.println();
		Student s2=new Student("Shubham",8.42,22);
		System.out.println(s2.getName());
		System.out.println("---------------");
		s2.setName("Shubu");
		System.out.println(s2.getName());
	}
}
//o/p
//23
//8.55
//---------------
//8.73
//
//
//Shubham
//---------------
//Shubu
