import java.util.HashMap;
import java.util.Map;

public class remove {

	public static void main(String[] args) {
		Map<Character,String> mp=new HashMap<>();
		mp.put('a', "Anil");
		mp.put('b', "Babu");
		mp.put('c', "Charan");
		mp.put('d', "Dharani");
		mp.remove("Babu");
		System.out.println(mp);
	}

}
