package com.atom.model;

import java.util.Iterator;
import java.util.Vector;
public class DBLogin implements java.io.Serializable {
     private Vector users = new Vector();
    //Vector����ͬ���ģ�����addUser�Ͳ���Ҫͬ����
    public void addUser(String name, String pwd, String hint) {
        users.add(new User(name, pwd, hint));
    }
   //���淽���ж��Ƿ������ȷ��user
    public User getUser(String name,String pwd) {
        Iterator it = users.iterator();
        User user;
         //������Ҫͬ��
    synchronized(users) {
       while(it.hasNext()){
          user = (User)it.next();
          if(user.equals(name,pwd))
               return user;  //��������棬�ͷ��ص�ǰuser
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
