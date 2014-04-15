package javap.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTest {
	
	
	@UseCase(id=1,description="test1")
	public void test1(){}	
	@UseCase(id=2,description="test2")
	public void test2(){}
	@UseCase(id=3,description="test3")
	public void test3(){}

	
	public static void main(String[] args) {
		
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 1,2,3,4);
		Tracker.track(useCases, UseCaseTest.class);
	}

}

class Tracker{
	public  static void track(List<Integer> useCases,Class<?> trackClass){
		
		for(Method m: trackClass.getMethods()){
			UseCase uc = m.getAnnotation(UseCase.class );
			if(null!=uc){
				System.out.println(uc.id()+uc.description());
				useCases.remove(new Integer(uc.id()));
			}
			
		}
		
		for(int i: useCases){
			System.out.println("not found use case: "+i);
		}
	}
	
}
