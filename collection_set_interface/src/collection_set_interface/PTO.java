package collection_set_interface;

import java.util.LinkedHashSet;

public class PTO {

	public static void main(String[] args) {
		LinkedHashSet <String> data =new LinkedHashSet<String>();
		data.add("Orange");
		data.add("Apple");
		data.add("Banana");
		data.add("Lemon");
		System.out.println("Set:"+data);
		Object[] arr=data.toArray();
		System.out.println("The Array is");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

}
