import java.util.NavigableMap;
import java.util.TreeMap;

public class first_last_entry {

	public static void main(String[] args) {
		NavigableMap <Integer,String>np =new TreeMap<>();
		np.put(103, "May");
		np.put(100, "the");
		np.put(102, "Fourth");
		np.put(200, "be with");
		np.put(205, "you");
		System.out.println(np);
		System.out.println(np.firstEntry());
		System.out.println(np.lastEntry());





	}

}
