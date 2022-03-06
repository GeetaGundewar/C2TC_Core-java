import java.util.HashMap;

public class conkeyconvalue {
	public static void main(String[] args) {
		HashMap<Integer,String> hp=new HashMap<>();
		hp.put(1, "Computer");
		hp.put(2,"Laptop");
		hp.put(3, "smartphone");
		hp.put(4, "headphone");
		hp.put(5 ,"charger");
		System.out.println(hp.containsKey(2));
		System.out.println(hp.containsKey(45));
		System.out.println(hp.containsValue("Computer"));
		System.out.println(hp.containsValue("table"));
	}
}
