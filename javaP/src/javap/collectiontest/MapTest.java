package javap.collectiontest;

import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		tm.put("1", "data1");
		tm.put("4", "data1");
		tm.put("5", "data1");
		tm.put("2", "data1");
		
		System.out.println(tm);
		
		

	}

}
