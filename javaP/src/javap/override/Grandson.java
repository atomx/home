package javap.override;

public class Grandson extends Child {
	public String a = "I am Grandson";
	@Override
	public String getS(){
		return a;
	}
}
