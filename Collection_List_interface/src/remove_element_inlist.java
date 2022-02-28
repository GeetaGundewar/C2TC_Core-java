import java.util.LinkedList;

public class remove_element_inlist {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("vijay");
		ll.add("Vinay");
		ll.add("vishnu");
		ll.add("Geeta");
		ll.add("Janhavi");
		System.out.println("LinkedKist :" +ll);
		ll.remove("vijay");
		System.out.println("LinkedKist :" +ll);

	}

}
