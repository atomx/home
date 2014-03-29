package javap.innerclass;

public class TestAnonynoustInner {
	
	public Contents contents(){
		
		return new Contents(){
			private int i;
			public int value(){return i;}
		};
	}

	public static void main(String[] args) {
		TestAnonynoustInner in = new TestAnonynoustInner();
		System.out.println(in.contents().value());
	}

}

 interface Contents{ int value();}