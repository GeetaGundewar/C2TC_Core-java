import java.util.LinkedList;

public class Add_last_ele {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("vijay");
		System.out.println("Alinked list is" +ll);
		ll.addLast("Geeta");
		System.out.println("After Linked List "+ll);
	}

}
