import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) 
	{
		List<Integer> ll=new ArrayList<>();
		ll.add(0);
		ll.add(11);
		ll.add(23);
		ll.add(34);
		ll.add(44);
		ll.remove(3);
		System.out.println("ArrayList:" +ll);

	}

}
