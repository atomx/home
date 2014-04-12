package javap.array;

import javap.Test;

public class DifferentPackage extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DifferentPackage extendsClass = new DifferentPackage();
		System.out.println("can only see protected:"+extendsClass.protectedString);
	}

}
