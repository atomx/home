package javaP.nulltest;

public class Position {
	
	private Person person;
	private String title;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Position(Person p, String title){
		this.person = p;
		this.title = title;
	}
	
	public Position(String title){
		this(null,title);
	}
	
}
