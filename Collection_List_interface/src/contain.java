import java.util.ArrayList;
import java.util.List;

public class contain {

	public static void main(String[] args) 
	{
		List<String> ls=new ArrayList<>();
		ls.add("River");
		ls.add("sea");
		ls.add("salt");
		ls.add("liquid");
		System.out.println(ls);
		String s = "liquid";
		boolean c =ls.contains(s);
		if(c) {
			System.out.println(ls.indexOf(s));
		}

	}

}
