import java.util.LinkedList;

public class remove_fi_occorance {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("Geeta");
		ll.add("Vinay");
		ll.add("vishnu");
		ll.add("Geeta");
		ll.add("Janhavi");
		System.out.println("LinkedKist :" +ll);
		ll.removeFirstOccurrence("Geeta");
		System.out.println("LinkedKist :" +ll);

		
	}

}
