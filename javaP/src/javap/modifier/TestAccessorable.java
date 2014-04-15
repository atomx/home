package javap.modifier;

import javap.SamePackageExtends;
import javap.Test;

public class TestAccessorable {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("t can not see protected,no modifier variable");
		SamePackageExtends ext = new SamePackageExtends();
		System.out.println("ext can not access any package or protected field directly");

	}

}
