package javap;

import java.util.Random;


public class PrivateThreadLocalTest implements Runnable {
    //�����ֲ߳̾�����studentLocal���ں�����ᷢ����������Student����
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
     * ʾ��ҵ�񷽷�����������
     */
    public void accessStudent() {
        //��ȡ��ǰ�̵߳�����
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " is running!");
        //����һ�����������ӡ
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + " set age to:" + age);
        //��ȡһ��Student���󣬲��������������뵽����������
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