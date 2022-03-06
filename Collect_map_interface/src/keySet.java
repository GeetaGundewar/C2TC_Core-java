import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class keySet {

	public static void main(String[] args) {
		Map<String,String> mp=new HashMap<>();
		mp.put("Name","Tanay Kumar");
		mp.put("Occupation","Developer");
		mp.put("country","India");
		System.out.println(mp.get("Name"));
		Iterator<String> keySetIteraror = mp.keySet().iterator();
		while (keySetIteraror.hasNext())
		{
			String key=keySetIteraror.next();
			System.out.println(key+"  "+mp.get(key));
		}

	}

}
