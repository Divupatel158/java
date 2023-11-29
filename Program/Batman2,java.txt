package oops7;

public class Batman2 {
	int age;	//global non static variable
	//constructor 
	Batman2(int age){
		this.age=age;
	}
	@Override 
	public boolean equals(Object obj)
	{	//internally Objects obj=new Batman2(); //upcasting
		//when we do upcasting subclass properties are hidden 
		Batman2 b=(Batman2)obj;//downcasting 
		return this.age==b.age;
	}
	public static void main(String[] args) {
		Batman2 b1=new Batman2(10);
		Batman2 b2=new Batman2(10);
		System.out.println(b1.equals(b2));
	}
}
//0/p  true