package javap;

import java.util.Random;


public class PrivateThreadLocalTest implements Runnable {
    //创建线程局部变量studentLocal，在后面你会发现用来保存Student对象
    private Student st = new Student();
 
    public static void main(String[] agrs) {
    	PrivateThreadLocalTest td1 = new PrivateThreadLocalTest();
    	PrivateThreadLocalTest td2 = new PrivateThreadLocalTest();
        Thread t1 = new Thread(td1, "a");
        Thread t2 = new Thread(td2, "b");
        t1.start();
        t2.start();
    }
 
    public void run() {
        accessStudent();
    }
 
    /**
     * 示例业务方法，用来测试
     */
    public void accessStudent() {
        //获取当前线程的名字
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " is running!");
        //产生一个随机数并打印
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + " set age to:" + age);
        //获取一个Student对象，并将随机数年龄插入到对象属性中
        //Student student = getStudent();
        st.setAge(age);
        System.out.println("thread " + currentThreadName + " first read age is:" + st.getAge());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("thread " + currentThreadName + " second read age is:" + st.getAge());
    }
 

}