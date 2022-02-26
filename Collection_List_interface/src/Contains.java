import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) 
	{
		List<String> ls=new ArrayList<>();
		ls.add("Pen");
		ls.add("Pencil");
		ls.add("eraser");
		System.out.println("ArrayList:"+ls);
		boolean res=ls.contains("pencil");
		System.out.println("Is pencil present in the list :-"+ res);
	}

}
