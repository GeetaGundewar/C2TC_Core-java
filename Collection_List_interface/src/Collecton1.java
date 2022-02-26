import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collecton1 {

	public static void main(String[] args)
	{
		List<Integer> ab =new ArrayList<>();
		ab.add(0);
		ab.add(11);
		ab.add(23);
		
		Iterator<Integer>  A=ab.iterator();
		while(A.hasNext())
		{
			System.out.println(A.next());
		}
			System.out.println("ArrayList" +ab);
		}


	}

