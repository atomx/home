package java.generic;
/**
 * ²Á³ýµÄ²¹³¥
 * @author nexu
 *
 */
public class Test2<T> {
	
	Class<T> type;
	
	public Test2(Class<T> t){type=t;}
	
	public void  f(Object arg){
		System.out.println( type.isInstance(arg));
	}
	
	

	public static void main(String[] args) {
		Building b = new Building();
		House h = new House();
		
		Test2<Building> testBuilding= new Test2<Building>(Building.class);
		testBuilding.f(b);
		testBuilding.f(h);
		
		Test2<House> testHouse = new Test2<House>(House.class);
		testHouse.f(b);
		testHouse.f(h);
		
		
		
		// TODO Auto-generated method stub

	}

}

class Building{}
class House extends Building{}
