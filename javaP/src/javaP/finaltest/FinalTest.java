package javaP.finaltest;

public class FinalTest {
	
	private final Val value = new Val(3);
	private static final Val VAL = new Val(5);
	public final String s = "test";
	
	public static void main(String[] args) {
		
		FinalTest t = new FinalTest();
		
		//t.value = new Val(1);  can not change reference
		System.out.println(t.VAL.toString());
	}

}

class Val{
	private int i;
	
	public Val(int a){
		i=a;
	}
	
	public String toString(){
		return "value is: " + i;
	}
	
}

