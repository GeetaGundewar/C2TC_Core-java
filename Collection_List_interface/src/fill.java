import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fill {

	public static void main(String[] args) 
	{
		List<String> lis=new ArrayList<>();
		lis.add("java");
		lis.add("Technical");
		lis.add("webinar");
		System.out.println("ArrayList: "+lis);
		Collections.fill(lis,"Webinar");
		System.out.println("After Replacementv of ArrayList: "+lis);

	}

}
