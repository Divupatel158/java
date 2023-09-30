//30-09-2023
package oops3;
class User{
	String Gmail;
	long Phno;
	String Password;
	User(String Username,String password){
		this.Gmail=Username;
		this.Password=password;
	}
	User(long phno,String password){
		this.Phno=phno;
		this.Password=password;
	}
}
public class ShadiAppLogin {
	public static void main(String[] args) {
		User u1=new User("abc123@gmail.com","Djh@1234");
		System.out.println(u1.Gmail);
		System.out.println(u1.Password);
		System.out.println("------------------------");
		User u2=new User(8632365278l,"Djh@1234");
		System.out.println(u2.Phno);
		System.out.println(u2.Password);
	}
}
//o/p
//abc123@gmail.com
//Djh@1234
//------------------------
//8632365278
//Djh@1234
