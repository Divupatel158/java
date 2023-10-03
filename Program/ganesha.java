//03-10-2023
package oops3;
public class ganesha {
	{	//Non static block 1
		System.out.println("Hello Ganesha");
	}
	{	//Non static block 2
		System.out.println("Welcome to Qspiders");
	}
	public static void main(String[] args) {
		System.out.println("Main start ");
		ganesha g1=new ganesha();
		System.out.println("----------------");
		ganesha g2=new ganesha();
		System.out.println("Main end ");
	}
	{	//Non static block 3
		System.out.println("Agale barash to jaldi aana");
	}
}
//0/p
//Main start 
//Hello Ganesha
//Welcome to Qspiders
//Agale barash to jaldi aana
//----------------
//Hello Ganesha
//Welcome to Qspiders
//Agale barash to jaldi aana
//Main end 
//Main end 