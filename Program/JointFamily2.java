//12-10-2023
package oops5;
//single inheritance
class Father{	//one method inside father class -- work()
	void work() {
		System.out.println("Work method of father class");
	}
}
class Son extends Father{
	//has 2 methods
	//1-- inherited method --work() , 2-- own method -- play()
	void play() {	
		System.out.println("play method of son class");
	}
}
public class JointFamily2 {
	public static void main(String[] args) {
		System.out.println("class start");
		Son s1=new Son();
		s1.play();
		s1.work();
		System.out.println("class end");
	}
}
//o/p
//class start
//play method of son class
//Work method of father class
//class end
