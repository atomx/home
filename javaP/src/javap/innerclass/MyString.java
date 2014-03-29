package javap.innerclass;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MyString{
	
	private String s = "out";
	
	
	
 class InnerString {
	
	public String toString(){
		System.out.println("S: "+ s);
		return s;
	}
	


}
 
	public static void main(String[] args) throws UnsupportedEncodingException {
		MyString myStr = new MyString();
		InnerString inStr =  myStr.new InnerString();
		inStr.toString();
		
		String att = URLEncoder.encode("{\"IsDefaultCheckoutInstrument\":\"true\"}","utf-8");
		
		System.out.println(att);

	}
 }
