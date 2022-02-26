package PTO1;

public class Demo17 {

	public static void main(String[] args)
	{
		String s="Greate", t="H";
				String u =s.concat(t);
		if(u==s)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");

		}
		String e =s+t;
		if(e==s)
		{
			System.out.println("same");

		}
		else
		{
			System.out.println(" Not same");

		}
	}

}
