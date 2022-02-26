import java.util.ArrayList;
import java.util.List;

public class clear {

	public static void main(String[] args) 
	{
		List<String> as=new ArrayList<>();
		as.add("java");
		as.add("Is");
		as.add("Good");
		System.out.println("ArrayList before clear:"+as);
		as.clear();
		System.out.println("ArrayList After clear"+as);


		
	}

}
