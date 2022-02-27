import java.util.ArrayList;
import java.util.List;

public class set {

	public static void main(String[] args)
	{
		List<Integer> lit=new ArrayList<>();
		lit.add(2654);
		lit.add(3663);
		lit.add(2348);
		lit.add(2293);
		lit.add(9990);
		lit.add(3167);
		lit.add(5799);
		System.out.println("ArrayList: "+lit);
		lit.set(1, 9999);
		lit.set(4, 9999);
		System.out.println("ArrayList:"+lit);
	}

}
