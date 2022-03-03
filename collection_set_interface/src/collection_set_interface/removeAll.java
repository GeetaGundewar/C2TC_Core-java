package collection_set_interface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public class removeAll {

	public static void main(String[] args) {
		LinkedHashSet <Integer> data =new LinkedHashSet<Integer>();
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(56);
		data.add(45);
		data.add(60);
		System.out.println("Set: "+data);
		ArrayList <Integer> data2 =new ArrayList<Integer>();
		data2.add(50);
		data2.add(70);
		data2.add(49);
		System.out.println("NewSet: "+data2);
		data.removeAll(data2);
		System.out.println("Removing data :"+data);
	}

}
