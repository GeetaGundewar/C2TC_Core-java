package collection_set_interface;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class PTO5 {

	public static void main(String[] args) {
		String[] str = {"one","Two","Three"};
		List<String>tmpList=Arrays.asList(str);
		TreeSet<String>unique =new TreeSet<String>(tmpList);
		System.out.println(unique);
	}

}
