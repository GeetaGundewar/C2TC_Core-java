import java.util.NavigableMap;
import java.util.TreeMap;

public class PTO_polllastentry {

	public static void main(String[] args) {
		NavigableMap <Integer,String>np =new TreeMap<>();
		np.put(3, "Tamilnadu");
		np.put(2, "Gujarat");
		np.put(4, "Orissa");
		np.put(1, "Kerala");
		System.out.println(np);
		System.out.println(np.pollLastEntry());
		System.out.println(np);

	}

}
