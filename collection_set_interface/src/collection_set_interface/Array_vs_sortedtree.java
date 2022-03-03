package collection_set_interface;

//import java.sql.Array;
//import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Array_vs_sortedtree {

	/*public static void main(String[] args) {
		int[]arr= {56,20,89,11,66,49,3,77};
		Arrays.sort(arr);
		System.out.println("Sorted Arrayy is: " +Arrays.toString(arr));
	}*/
		public static void main(String[] args) {
			SortedSet<Integer> obj =new TreeSet<>();
			obj.add(20);
			obj.add(16);
			obj.add(55);
			obj.add(34);
			System.out.println("Set: "+obj);	
	}
}

