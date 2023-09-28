Class Lambo
{
	string color="Red";
	double price= 200.00;

	void race()
		{
		system.out.println("long drive pe le jau tuje");
		}
}
class Driver 
{
	public static void main(String[] args)
	{
		lambo l1=new lambo();			//(adderess alocated 1) color["red"] price[200.00] race()
		l1.color="yellow;				//(change in 1alocated  color["yellow"] price[200.00] race()
		lambo l2=new lambo();			//(adderess alocated again) color["red"] price[200.00] race()
		l2.price=350.00;				//(change in 2nd alocated  color["red"] price[350.00] race()
		
	}
}