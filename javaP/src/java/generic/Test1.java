package java.generic;

public class Test1 implements TwoMethods{

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		GenericClass gClass = new GenericClass();
		gClass.callGeneric(t1);
		Test1 t2 = gClass.getGeneric(t1);
		t2.method2();

	}

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

	public void method3(){
		System.out.println("method3");}
}

class GenericClass{
	
	public <T extends TwoMethods> void callGeneric(T t){
		 t.method1();
	}
	
	public <T extends TwoMethods> T getGeneric(T t){
		return t;
	}
}

interface TwoMethods{
	public void method1();
	public void method2();
}