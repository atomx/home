package javap.modifier;

import javap.Test;

public class DifferentPackageExtends extends Test{
	
	public void printVariable(){
		System.out.println("can see protected field: "+this.protectedString);
		
	}

}
