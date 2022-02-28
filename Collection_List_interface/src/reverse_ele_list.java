import java.util.Iterator;
import java.util.LinkedList;

public class reverse_ele_list {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("Geeta");
		ll.add("vishnu");
		ll.add("Seema");
		ll.add("Janhavi");
		System.out.println("LinkedKist :" +ll);
		Iterator<String> i=ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
		
	}

}
