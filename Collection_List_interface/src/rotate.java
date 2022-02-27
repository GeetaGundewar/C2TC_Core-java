import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotate {

	public static void main(String[] args) 
	{
		List<String> ls=new ArrayList<>();
		ls.add("Practice");
		ls.add("code");
		ls.add("every");
		ls.add("day");
		System.out.println("ArrayList: " +ls);
		Collections.rotate(ls,2);
		System.out.println("Rotated ArrayList: " +ls);

	}

}
