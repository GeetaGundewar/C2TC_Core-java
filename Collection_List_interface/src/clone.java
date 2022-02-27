import java.util.ArrayList;

public class clone {

	public static void main(String[] args) 
	{
		ArrayList<Object> lit=new ArrayList<>();
	    Object cloneList;
		lit.add("Java");
		lit.add("Cpp");
		lit.add("Python");
		lit.add("C#");
		System.out.println(lit);
		cloneList= lit.clone();
		System.out.println(cloneList);
	}

}
