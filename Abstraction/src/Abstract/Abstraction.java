package Abstract;

abstract class Bike 
{
	abstract void run();
	{
		System.out.println("running safely");
	}

}
public class Abstraction 
{
	public static void main(String[] args)
	{
		Honda h=new Honda();
		h.run();
	}

}