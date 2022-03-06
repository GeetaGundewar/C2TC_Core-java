import java.util.HashMap;
import java.util.Map;

public class get {

	public static void main(String[] args) {
		Map<String,String> mp=new HashMap<>();
		mp.put("Name","Tanay");
		mp.put("Occupation","Engineer");
		mp.put("country","India");
		System.out.println(mp.get("Name"));
	}

}
