package javap.nulltest;

import java.util.ArrayList;

public class Staff extends ArrayList<Position>{
	public void add(String title, Person p){
		add(new Position(p,title));
	}
	
	public Staff(String... title){
		for(String t: title){
			add(new Position(null,t));
		}
	}
	
	public boolean positionAvaiable(String title){
		
		for(Position p:this){
			if(p.getTitle().equals(title)&&p.getPerson()==null){
				return true;
			}			
		}
		return false;
	}
	
	public void fillPosition(String title, Person hire){
		for(Position p:this){
			
			if(p.getTitle().equals(title)&&p.getPerson()==null){
				p.setPerson(hire);
			}
			
		}
	}
	
	public String toString(){
		StringBuilder result=new StringBuilder();
		for(Position p:this){
			result.append(p.getTitle()).append("|").append(p.getPerson()).append("==");
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		Staff staff = new Staff("CEO","Manager","Engineer");
		
		staff.fillPosition("CEO", new Person("Xu",30));
		
		System.out.println("Manager is available?"+staff.positionAvaiable("Manager"));
		
		staff.add("Staff Engineer", new Person("atom",30));
		
		System.out.println(staff);

	}

}
