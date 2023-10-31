//31-10-2023
package oops5;
class employee1{
	void work(){
		System.out.println("Employee working ");
	}
}
class Developer extends employee1{
	@Override
	void work() {
		System.out.println("developer working");
	}
}
class Tester extends employee1{
	@Override
	void work() {
		System.out.println("Tester working");
	}
}
class HR extends employee1{
	@Override
	void work() {
		System.out.println("HR working");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		employee1 e1=new Developer();
		e1.work();
	}
}
//o/p
//developer working