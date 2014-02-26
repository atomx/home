package javaP.override;

public class Child extends Base {
	@Override
	public void print(){
		System.out.println("Child");
	}
	
	@Override
	public void print2(){
		System.out.println("Child2");
	}

}
