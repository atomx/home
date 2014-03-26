package java.collection;

public class ArrayTest {
	

	public static void main(String[] args) {
		Building[] h = new House[10];
		h[0] = new House();
		//h[1] = new Building(); // will throw exception ArrayStoreException
		h[3] = new Department();
		

	}

}


class Building{}
class House extends Building{}
class Department extends House{}