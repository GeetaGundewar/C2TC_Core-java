import java.util.HashMap;

public class putall {

	public static void main(String[] args) {
		HashMap<Integer,String> hp=new HashMap<>();
		hp.put(1, "eat");
		hp.put(2,"mobile");
		hp.put(3, "sleep");
		hp.put(4, "repeat");
		System.out.println("Map: "+hp);
		HashMap<Integer,String> hp2=new HashMap<>();
		hp2.putAll(hp);
		System.out.println(hp2);

	}

}
