import java.util.ArrayList;
import java.util.List;

public class indexOf_and_LastIndex {

	public static void main(String[] args) 
	{
		List<String> lis =new ArrayList<>();
		lis.add("JAVA");
		lis.add("J2EE");
		lis.add("JSP");
		lis.add("JAVASCRIPT");
		lis.add("SERVETS");
		lis.add("JAVA");
		lis.add("STRUTS");
		System.out.println("ArrayList: "+lis);
		System.out.println(lis.indexOf("JAVA"));
		System.out.println(lis.lastIndexOf("JAVA"));
		
	}

}
