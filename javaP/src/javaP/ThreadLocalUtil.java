package javaP;

import java.util.Collections;



public class ThreadLocalUtil <T extends Object>{
    
    //�����ֲ߳̾�����session����������Hibernate��Session
    private  final ThreadLocal<T> threadVariable = new ThreadLocal<T>();
    

    public T get() {
          T s = (T)threadVariable.get();
        // ���Session��û�д򿪣����¿�һ��Session
//        if (s == null) {
//            s = new T();
//            threadVariable.set(s);         
//        }
        return s;
    }
 
    public  void set(T s){
    	threadVariable.set(s);       
    
    }
    
    public void test(){
    	
    }
}
