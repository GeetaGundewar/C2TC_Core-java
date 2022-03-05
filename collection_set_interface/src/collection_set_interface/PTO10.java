package collection_set_interface;

import java.util.TreeSet;

public class PTO10 {

	public static void main(String[] args) {
		TreeSet<Integer> tr=new TreeSet<>();
		tr.add(3);
		tr.add(67);
		tr.add(90);
		tr.add(626);
		tr.add(0);
		System.out.println("Initial set : "+tr );
		System.out.println("Head set :"+tr.tailSet(90));
	}

}
