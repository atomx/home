package com.atom.model;

import java.util.Iterator;
import java.util.Vector;
public class DBLogin implements java.io.Serializable {
     private Vector users = new Vector();
    //Vector类是同步的，所以addUser就不需要同步了
    public void addUser(String name, String pwd, String hint) {
        users.add(new User(name, pwd, hint));
    }
   //下面方法判断是否存在正确的user
    public User getUser(String name,String pwd) {
        Iterator it = users.iterator();
        User user;
         //迭代需要同步
    synchronized(users) {
       while(it.hasNext()){
          user = (User)it.next();
          if(user.equals(name,pwd))
               return user;  //如果返回真，就返回当前user
        }
     }
     return null;
     }
     public String getHint(String name) {
         Iterator it = users.iterator();
         User user;
     synchronized(users) {
         while(it.hasNext()){
         user = (User)it.next();
         if(user.getUserName().equals(name))
             return user.getHint();
         }
     }
   return null;
     }
}
