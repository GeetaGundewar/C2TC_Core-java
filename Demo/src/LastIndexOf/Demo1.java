package LastIndexOf;

public class Demo1 {

	public static void main(String[] args) 
	{
		String str= "This is last index of Example";
		int index=str.lastIndexOf("last");
		System.out.println(index);
		index=str.lastIndexOf("of",25);
		System.out.println(index);
		index=str.lastIndexOf("of",10);
		System.out.println(index);

	}

}
