package javap.collectiontest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionData<T> extends ArrayList<T> {
	
	private static final long serialVersionUID = 1L;

	public CollectionData(Generator<T> gen, int quantity){
		for(int i=0; i<quantity; i++){
			add(gen.next());
		}
	}
	
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
		return new CollectionData<T>(gen,quantity);
		
	}

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(),3));
		System.out.println(set);
	}

}

class Government implements Generator<String>{
	String[] foundation = {"test1","test2","test3"};
	private int index = 0;
	
	public String next(){return foundation[index++];}
}

interface Generator<T>{
	public T next();
	
}
