package javaP;

import java.util.Collections;



public class ThreadLocalUtil <T extends Object>{
    
    //创建线程局部变量session，用来保存Hibernate的Session
    private  final ThreadLocal<T> threadVariable = new ThreadLocal<T>();
    

    public T get() {
          T s = (T)threadVariable.get();
        // 如果Session还没有打开，则新开一个Session
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
