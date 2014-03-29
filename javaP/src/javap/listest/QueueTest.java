package javap.listest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu = new LinkedList<String>();
		
		qu.offer("1");
		qu.offer("2");
		qu.offer("2");
		qu.offer("2");
		
		System.out.println("size: "+qu.size());
		
		System.out.println("poll: "+qu.poll());
		System.out.println("size: "+qu.size());
		
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("2");
		pq.offer("1");
		System.out.println(pq);
		
		
		List<String> list =Arrays.asList("I am a big boy".split(" "));
		System.out.println(list);
		for(String a:list)
			System.out.println(a);
		//list.add("test");//can not add, since it is one fixed size
		
		for(Map.Entry entry: System.getenv().entrySet())
			System.out.println("entry key: "+entry.getKey()+" entry value: "+entry.getValue());
	}

}
