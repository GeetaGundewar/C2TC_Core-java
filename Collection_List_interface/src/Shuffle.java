import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) 
	{
		List<String> lis=new ArrayList<>();
		lis.add("c");
		lis.add("python");
		lis.add(".Net");
		lis.add("compiler");
		Collections.shuffle(lis);
		System.out.println("After Operation: "+lis);
		Collections.shuffle(lis);
		System.out.println("After suffle Operation: "+lis);


		
	}

}
