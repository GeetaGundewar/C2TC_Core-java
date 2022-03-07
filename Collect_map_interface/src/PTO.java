import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class PTO {

	public static void main(String[] args) {
		NavigableMap <Integer,String>np =new TreeMap<>();
		np.put(4, "Nissan");
		np.put(2, "Toyato");
		np.put(6, "Honda");
		np.put(1, "Mercedes");
		np.put(3, "Volvo");
		np.put(5, "Volkswagen");
		System.out.println(np);
		SortedMap <Integer,String>n1 =new TreeMap<>();
		n1=np.headMap(4);
		System.out.println(n1);
		SortedMap <Integer,String>s1 =new TreeMap<>();
		s1=np.tailMap(5);
		System.out.println(s1);
		SortedMap<Integer, String>w1 =new TreeMap<>();
		w1=np.subMap(3,8);
		System.out.println(w1);


		


		
	}

}
