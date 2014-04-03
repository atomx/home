package javap.collectiontest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	

	public static void main(String[] args) {
		
		Map<KeyClass, String> testMap = new HashMap<KeyClass, String>();
		
		KeyClass key1 =  new KeyClass(1);
		KeyClass key2 =  new KeyClass(2);
		KeyClass key3 =  new KeyClass(3);
		KeyClass key4 =  new KeyClass(1);
		
		testMap.put(key1, "1");
		testMap.put(key2, "2");
		testMap.put(key3, "3");
		testMap.put(key4, "4");
		
		System.out.println("size:"  + testMap.size());
		
		System.out.println("key1:"  + testMap.get(key1));
		System.out.println("key4:"  + testMap.get(key4));
	}

}

class KeyClass{
	
	int num;
	
	public KeyClass(int input){
		num = input;
	}
	
	public int hashCode(){
		return num;
	}
	
	public boolean equals(Object o){
		
		if (o instanceof KeyClass){
			if(((KeyClass) o).num == this.num)
			return true;
		}
		
		return false;
	}
}
