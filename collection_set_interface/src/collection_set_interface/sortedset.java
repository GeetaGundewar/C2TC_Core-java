package collection_set_interface;
import java.util.SortedSet;
import java.util.TreeSet;
public class sortedset {

	public static void main(String[] args) {
		SortedSet<Integer> obj =new TreeSet<>();
		obj.add(20);
		obj.add(16);
		obj.add(55);
		obj.add(34);
		System.out.println("Set: "+obj);	
	}

}
