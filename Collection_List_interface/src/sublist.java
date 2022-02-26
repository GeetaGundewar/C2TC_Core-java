import java.util.ArrayList;
import java.util.List;

public class sublist {

	public static void main(String[] args) 
	{
		List<String> ls=new ArrayList<>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("Random");
		ls.add("click");
		System.out.println("ArrayList: "+ls);
		List<String> ls2 =ls.subList(0,3);
		System.out.println("ArrayList: "+ls2);
	}

}
