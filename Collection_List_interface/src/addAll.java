import java.util.ArrayList;
import java.util.List;

public class addAll {

	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();
		ls.add("Corona can be stoped");
		List<String> ls2 = new ArrayList<>();
		ls2.add("Stay at home");
		ls.addAll(ls2);
		System.out.println(ls);
	}

}
