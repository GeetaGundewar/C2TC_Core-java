import java.util.LinkedList;

public class remove_element_perticularpos {

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
		ll.remove(4);
		System.out.println("LinkedKist :" +ll);

	}

}
