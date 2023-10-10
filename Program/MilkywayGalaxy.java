//10-10-2023
package oops4box;
public class MilkywayGalaxy {
	public static void main(String[] args) {
	Spacex s1=new Spacex(100,"naisargi",5000);
	//System.out.println(s1.eid);		as it is private it can't access directly
	//System.out.println(s1.name);	as it is private it can't access directly
	System.out.println("emp id is "+s1.getEid());	//accessing private attribute/variable using getter method
	System.out.println("emp name is "+s1.getName());
	//s1.eid=200;		as it is private it can't be modified
	s1.setEid(700);	//modifying private attribute using setter method
	System.out.println("Modified emp id is "+s1.getEid());
	s1.setName("nishu");
	System.out.println("modified name is "+s1.getName());
	}
}
//o/p
//emp id is 100
//emp name is naisargi
//Modified emp id is 700
//modified name is nishu