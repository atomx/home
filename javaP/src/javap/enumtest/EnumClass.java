package javap.enumtest;

public class EnumClass {

	public static void main(String[] args) {
		for(Shrubbery s: Shrubbery.values()){
			System.out.println("name: "+s.name());
		
			System.out.println("ordinal: "+s.ordinal());
		}
		
		Shrubbery s = Shrubbery.valueOf("GROUND");
		System.out.println("value of string:" + s.name() +" to String() "+ s.toString());
		
		//Shrubbery test = Shrubbery.get("s");
		//System.out.println(test.name());
		System.out.println(System.getenv("CLASSPATH"));

	}

}

enum Shrubbery{
	GROUND, CRAWLING, HANGIN;
	
	public static Shrubbery get(String s){
		
		Shrubbery sh = valueOf(s);
		
		if (null==sh) return GROUND;
		
		return sh;
		
	}

}

enum BaBa{
	HELLO("hello world",0),
	HI("hi world",1);
	
	private String desc;
	private int value;
	BaBa(String s, int i){
		desc =s;
		value =i;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public int getValue(){
		return value;
	}
}