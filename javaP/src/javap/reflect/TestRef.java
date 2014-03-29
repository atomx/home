package javap.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRef {

    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Foo foo = new Foo("this is foo object");
        Class<? extends Foo> clazz = foo.getClass();
        Method m1 = clazz.getDeclaredMethod("outInfo");
        Method m2 = clazz.getDeclaredMethod("setMsg", String.class);
        Method m3 = clazz.getDeclaredMethod("getMsg");
        m1.invoke(foo);
        m2.invoke(foo, "reset foo msg");
        String msg = (String) m3.invoke(foo);
        System.out.println(msg);
    }
}

class Foo {
    private String msg;

    public Foo(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void outInfo() {
        System.out.println("test java reflect method invoke");
    }
}
