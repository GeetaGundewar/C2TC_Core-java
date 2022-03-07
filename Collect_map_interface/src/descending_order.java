import java.util.NavigableMap;
import java.util.TreeMap;

public class descending_order {

	public static void main(String[] args) {
		NavigableMap <Character,String>np =new TreeMap<>();
		np.put('b', "Barbie");
		np.put('a', "Angle");
		np.put('d', "Dora");
		np.put('c', "charlie");
		np.put('e', "emy");
		np.put('t', "tom");
		np.put('j', "jerry");
		System.out.println(np);
		NavigableMap<Character, String> nvp=np.descendingMap();
		System.out.println(nvp);
	}

}
