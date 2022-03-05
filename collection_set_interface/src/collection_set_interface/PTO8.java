package collection_set_interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class PTO8 {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<String>();
		set.add("Welcome");
		set.add("To");
		set.add("C2TC");
		set.add("Technical");
		set.add("Webinar");
		System.out.println("Sorted set: "+set);
		Object[]arr=set.toArray();
		System.out.println("The array is: ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
