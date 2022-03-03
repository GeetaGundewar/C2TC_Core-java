package collection_set_interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class PTO1 {

	public static void main(String[] args) {
		SortedSet<String> obj =new TreeSet<>();
		obj.add("Techanical");
		obj.add("Technology");
		obj.add("data");
		obj.add("quiz");
		System.out.println("Set: "+obj);	
		System.out.println("First_Set: "+obj.first());	
		System.out.println("Second_Set: "+obj.last());	


		
	}
	}


