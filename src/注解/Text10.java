package 注解;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 2022-01-25 20:39
 */
public class Text10 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1=Class.forName("注解.User");

        User user=(User)c1.newInstance();
        System.out.println(user);

        //通过构造器创建对象
        System.out.println("=====");
        Constructor constructor=c1.getDeclaredConstructor(String.class,int.class,int.class);
        User user2=(User) constructor.newInstance("请假",001,14);
        System.out.println(user2);

        //通过反射调用普通方法
        User user3=(User) c1.newInstance();
        //通过反射获得一个方法
        Method setName=c1.getDeclaredMethod("setName", String.class);

        //invoke:激活的意思  （对象，“方法的值”）
        setName.invoke(user3,"狂神");
        System.out.println(user3.getName());

        //通过反射操作属性
        System.out.println("==========");
        User user4=(User) c1.newInstance();
        Field name=c1.getDeclaredField("name");

        //不能直接操作私有属性 需要关闭安全检测
        name.setAccessible(true);
        name.set(user4,"狂神2");
        System.out.println(user4.getName());
    }
}
