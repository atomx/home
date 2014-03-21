package javaP.generic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Extends extends Base {
	
	public String age ="34";
	
	public String get(){return age;};
	
	public String toString(){
		return this.getClass().getSimpleName() + " age: "+age;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Holder<Base> h = new Holder<Base>(new Extends());
		
		Base b = h.get();
		System.out.println(b.getClass());
		
		Field[] fields =b.getClass().getDeclaredFields();
		Method[] methods = b.getClass().getMethods();
		for(Method m :methods){
			System.out.println("method name: "+m.getName());
			if("toString".equals(m.getName())){
				System.out.println("invoke toString: "+m.invoke(b, null));
			}
			//m.invoke(b,m.getParameterTypes());
		}
		
		for(Field f : fields){
			System.out.println(f.getName());
			System.out.println(f.getType());
			Class target = f.getType();
			
		}
		
		

	}

}

class Holder<T>{
	
	private T t;
	public Holder(T t){this.t=t;}
	public T get(){return t;}
}