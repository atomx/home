package java.constructor;

public class Father {
//	public Father(){
//		System.out.println("default constructor");
//	}
	
//	public Father(String a){
//		System.out.println("I am father");
//	}

	public static void main(String[] args) {
		Child child = new Child();
		Child child1 = new Child("String");
		Class c = Child.class;
		try {
			Object o = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
