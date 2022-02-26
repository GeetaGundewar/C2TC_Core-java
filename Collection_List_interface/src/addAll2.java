import java.util.ArrayList;
import java.util.List;

public class addAll2 {

	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<>();
		ls.add(100);
		ls.add(200);
		List<Integer> ls2=new ArrayList<>();
		ls2.add(300);
		ls2.add(400);
		ls2.addAll(ls);
		System.out.println(ls);
	}

}
