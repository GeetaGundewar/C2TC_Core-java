import java.util.LinkedList;

public class poll {

	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<>();
		ls.add("Gem");
		ls.add("4");
		ls.add("Grey");
		ls.add("8");
		System.out.println("The list is "+ls);
		System.out.println(ls.poll());
		System.out.println("Head of  list  " +ls);
	}

}
