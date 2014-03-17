/**
 * 
 */
package javaP.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author nexu
 *
 */
public class TestReflect {
	
	private int age = 25;
	private String name = "hello";
	
	public TestReflect(int age, String name){
		this.age = age;
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return name;
	}

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c = TestReflect.class;

		Method[] methods =c.getMethods();
		for(Method m : methods){
			System.out.println("method name "+m);
		}
		
		Constructor[] cons = c.getConstructors();
		for(Constructor con  :cons){
			
			System.out.println("constructot name "+con.getName());
		}
		
		
	}

}
