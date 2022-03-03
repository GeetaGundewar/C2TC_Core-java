package collection_set_interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddAll {

	public static void main(String[] args) {
		Set <Integer> data =new LinkedHashSet<Integer>();
		data.add(20);
		data.add(21);
		data.add(30);
		System.out.println("Set: "+data);
		Set <Integer> data2 =new LinkedHashSet<Integer>();
		data2.add(50);
		data2.add(55);
		data2.add(60);
		System.out.println("Set: "+data2);
		data.addAll(data2);
		System.out.println("set"+data);


	}

}
