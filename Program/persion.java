w a j p to print to take 3 attributes called as (name, bank acc. no, password) create persion class, create private antities,
 create public getter and setter method
create an object of persion in hdfc class

Answer :-

//1) public class
public class persion {
//2) private attributes
private String name;
private long bankA;
private String password;

//3) public constructor
persion(String name,long bankA,String password){
this.name=name;
this.bankA=bankA;
this.password=password;
}

public String getName(){
return name;
}
public void setName(string name){
this.name=name;
}

public long getBankA(){
return bankA;
}
public void setBankA(long bankA){
this.bankA=bankA;
}

public String getPassword(){
reutrn password;
}
public void setPassword(string password){
this.password=password;
}
}