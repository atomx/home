package javap.collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>(Arrays.asList("test","test2","test3"));
		
		for(String s: al){
			if("test2".equals(s)){al.remove(s);}
			
		}
		
		System.out.println(al);
		
		
		
	}

}
