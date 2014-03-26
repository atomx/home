package java.override;

public class Base { 
	
	private String s = "I am base";
	
	public String a = "I am Base public string";
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public void print(){
		System.out.println("Base");
	}
	
	public void print2(){
		System.out.println("Base2");
	}

	public static void main(String[] args) {
		Base b = new Grandson();
		b.print();
		b.print2();
		System.out.println(b.a);// note, field won't be ∂‡Ã¨ 
		System.out.println(b.getS());
	
		
		Grandson son = new Grandson();
		System.out.println("Get grandson a"+son.a);
		System.out.println("Get father's a"+((Base)son).a);
		son.print();

	}

}
