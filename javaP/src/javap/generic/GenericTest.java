package javap.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	
	public <A,B,C> void f(A a, B b, C c){
		System.out.println(a.getClass().getSimpleName());
	}
	
	public <A,B> void f(A a, B b, int i){
		
		System.out.println(i);
		
	}
	
    public <T> List<T> returnT(){
    	
    	return new ArrayList<T>();
    }
	
	public static void main(String[] args) {
		GenericTest g = new GenericTest();
		List<String> strList = g.returnT();
		strList.add("Test");

	}

}
