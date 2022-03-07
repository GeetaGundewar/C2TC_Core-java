import java.util.NavigableMap;
import java.util.TreeMap;

public class submap {

	public static void main(String[] args) {
		NavigableMap <Character,String>np =new TreeMap<>();
		np.put('b', "Barbie");
		np.put('a', "Angle");
		np.put('d', "Dora");
		np.put('c', "charlie");
		np.put('e', "emy");
		System.out.println(np);
		System.out.println(np.subMap('b', 'e'));
	}

}
