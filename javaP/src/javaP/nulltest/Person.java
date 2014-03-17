package javaP.nulltest;

public class Person {
	
	private final String name;
	private final int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+age;
	}

}
