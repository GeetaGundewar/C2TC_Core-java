package collection_set_interface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PTO2 {

	public static void main(String[] args) {
		SortedSet<String> obj =new TreeSet<>();
		obj.add("Techanical");
		obj.add("Technology");
		obj.add("data");
		obj.add("quiz");
		System.out.println("Set: "+obj);
		Iterator<String> value =obj.iterator();
		System.out.println("After iterator");
		while(value.hasNext())
		{
			System.out.println(value.next());
		}
	}

}
