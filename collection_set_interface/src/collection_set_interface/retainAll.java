package collection_set_interface;

import java.util.LinkedHashSet;
//import java.util.Set;

public class retainAll {

	public static void main(String[] args) {
		LinkedHashSet <Integer> data =new LinkedHashSet<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		System.out.println("Set: "+data);
		LinkedHashSet <Integer> data2 =new LinkedHashSet<Integer>();
		data2.add(4);
		data2.add(5);
		data2.add(6);
		System.out.println("Set: "+data2);
		data.retainAll(data2);
		System.out.println(data);
	}

}
