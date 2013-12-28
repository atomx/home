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
	//判断当前对象用户名和密码是否相等
	public boolean equals(String uname, String upwd) {
	return getUserName().equals(uname) && getPassword().equals(upwd); 
	}
}
