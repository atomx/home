package java.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {
	
	static Collection fill(Collection<String> coll){
		coll.add("rat");
		coll.add("cat");
		coll.add("dog");
		coll.add("dog");
		return coll;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1,99);
		//list.add(22); cannot add, since asList() return fixed size array
		System.out.println(list);
		
		System.out.println(fill(new HashSet<String>()));// hash storage
		Collection<String> hs = fill(new HashSet<String>());
		System.out.println(fill(new TreeSet<String>()));// sort storage
		System.out.println(fill(new LinkedHashSet<String>())); // sort as add sequency
		
		

	}

}
