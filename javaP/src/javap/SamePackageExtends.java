package javap;

import javap.Test;

public class SamePackageExtends extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamePackageExtends extendsClass = new SamePackageExtends();
		System.out.println("can see package:"+extendsClass.packageString);
		System.out.println("can see protected:"+extendsClass.protectedString);
	}

}
