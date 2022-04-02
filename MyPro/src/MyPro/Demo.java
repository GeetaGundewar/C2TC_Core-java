package MyPro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo
{
	public static void main(String [] arg)
	{
		Set<String> vowels= new  HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		List<String> vowelsList =new ArrayList<>(vowels);
		System.out.println("vo set=" +vowels);
		System.out.println("voList=" +vowels);
		vowels.add("o");
		vowels.add("a");
		vowels.add("u");
		System.out.println("vo set=" +vowels);
		System.out.println("voList=" +vowels);
		vowels =new HashSet<>(vowelsList);
		System.out.println("vowels set =" +vowels);
		
	}
}

