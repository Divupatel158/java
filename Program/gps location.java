W.A.J.P to treck gps location (creat a class called as gps declare 3 attributes latitude, longitude and direation and creat a method called as trecklocation creat 3 objects and display the location )

//27-09-2023
package oops3;
class Treck{
	String direction;
	double latitude;
	double longitude;
	void trecklocation() {
		System.out.println(direction +"  " + latitude +"  "+ longitude);
	}
}
public class GPS {
	public static void main(String[] args) {
		Treck t1=new Treck();
		t1.trecklocation();
		t1.direction="North";
		t1.latitude= 180171.7171;
		t1.longitude=123456.7653;
		t1.trecklocation();
	}
}
//o.p -North  180171.7171  123456.7653