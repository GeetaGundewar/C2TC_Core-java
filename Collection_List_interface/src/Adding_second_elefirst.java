import java.util.LinkedList;

public class Adding_second_elefirst {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("vijay");
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Vinay");
		ll1.add("vishnu");
		ll.addAll(ll1); 
		System.out.println("After Invoking addAll method " +ll);
	}

}
