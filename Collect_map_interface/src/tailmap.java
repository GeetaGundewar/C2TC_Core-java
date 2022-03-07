import java.util.NavigableMap;
import java.util.TreeMap;

public class tailmap {

	public static void main(String[] args) {
		NavigableMap <Integer,String>np =new TreeMap<>();
		np.put(4, "Barbie");
		np.put(2, "Angle");
		np.put(6, "Dora");
		np.put(1, "charlie");
		np.put(3, "emy");
		np.put(5, "tom");
		np.put(7, "jerry");
		System.out.println(np);
		System.out.println(np.tailMap(4));
	}

}
