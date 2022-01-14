package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	
	public static void main(String[] args) {

				List<Integer> L=new ArrayList<Integer>();
				L.add(12);
				L.add(23);
				L.add(23);
				L.add(12);
				L.forEach(i->System.out.println(i));
				
				List<Integer> L1=new Arrays.asList(1,5,6,9,16);
				list2.stream().map(i->i*i).filter(i->i>37).forEach(i->
				System.out.println(i));

				} 
	}


