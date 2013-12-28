package com.atom.model;


public class User implements java.io.Serializable {
	private String userName=null, password=null, hint=null;	                
	public User(String userName, String password, String hint) {
	    this.userName = userName;
	    this.password = password;
	    this.hint = hint;
	}
	public String getUserName(){
	     return userName;
	}
	public String getPassword(){
	     return password;
	}
	public String getHint(){
	    return hint;
	}
	//�жϵ�ǰ�����û����������Ƿ����
	public boolean equals(String uname, String upwd) {
	return getUserName().equals(uname) && getPassword().equals(upwd); 
	}
}
