import java.util.LinkedList;

public class clear_ele {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("Geeta");
		ll.add("Vinay");
		ll.add("vishnu");
		ll.add("Seema");
		ll.add("Janhavi");
		System.out.println("LinkedKist :" +ll);
		ll.clear();
		System.out.println("LinkedKist :" +ll);
	}

}
