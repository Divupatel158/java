//13-10-2023
package oops5;
//Hierarchical Inheritance 
class FatherA{
	void work() {
		System.out.println("Hardworking Father");
	}
}
class SonA extends FatherA{
	//2 methods, 1 inherited work(), 1 own method ladala()
	void ladala() {
		System.out.println("beta hamara bada name karenga");
	}
}
class Doughter extends FatherA{
	//2 methods, 1 inherited work(), 1 own method nakchadi()
	void nakchadi() {
		System.out.println("jab dekho tab bas sararat karti he ");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		System.out.println("main start");
		FatherA f1=new FatherA();
		f1.work();
		SonA s1=new SonA();
		s1.ladala();
		s1.work();
		Doughter d1=new Doughter();
		d1.nakchadi();
		d1.work();
		System.out.println("main end");
	}
}
//o/p
//main start
//Hardworking Father
//beta hamara bada name karenga
//Hardworking Father
//jab dekho tab bas sararat karti he 
//Hardworking Father
//main end