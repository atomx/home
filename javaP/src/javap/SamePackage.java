package javap;

public class SamePackage {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("protected: "+t.protectedString);		
		System.out.println("package : "+t.packageString);

	}

}
