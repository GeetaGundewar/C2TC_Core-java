import java.util.HashMap;
import java.util.Map;

public class entrySet {

	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(96,"Tanay");
		mp.put(80,"Aditya");
		mp.put(100,"Neha");
		for(Map.Entry m:mp.entrySet())
		{
		System.out.println(m.getKey()+"  "+m.getValue());
	}

}
}
