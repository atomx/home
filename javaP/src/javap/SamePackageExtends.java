package javap;

import javap.Test;

public class SamePackageExtends extends Test{
	
	public void printProtected(){
		System.out.println(this.protectedString);
	}

	public static void main(String[] args) {
	
		SamePackageExtends extendsClass = new SamePackageExtends();
		System.out.println("can see no modify:"+extendsClass.packageString);
		System.out.println("can see protected:"+extendsClass.protectedString);
	}

}
