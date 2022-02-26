import java.util.ArrayList;
import java.util.List;

public class removeAll {

	public static void main(String[] args) 
	{
		List<Integer> ls =new ArrayList<>();
		List<Integer> ls2=new ArrayList<>();
		ls.add(100);
		ls.add(200);
		ls.add(250);
		ls2.add(350);
		ls2.add(400);
		System.out.println(ls);
		System.out.println(ls2);
		ls2.removeAll(ls);
		System.out.println(ls);
	}

}
