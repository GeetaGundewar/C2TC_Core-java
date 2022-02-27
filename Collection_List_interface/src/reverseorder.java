import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseorder {

	public static void main(String[] args) 
	{
		List<Integer> lis= new ArrayList<>();
		lis.add(80);
		lis.add(05);
		lis.add(32);
		lis.add(90);
		System.out.println("ArrayList : "+lis);
		Collections.sort(lis,Collections.reverseOrder());
		System.out.println("After Operation Of ArrayList: "+lis);
	}

}
