package 注解;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 2022-01-25 23:06
 */
public class Text11 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //普通方法
        User user=new User();
        //开始时间
        long startTime=System.currentTimeMillis();

        for (int i=0;i<1000000;i++){
            user.getName();
        }
        //结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("普通方式"+(endTime-startTime));

        //反射方法
        Class c1=Class.forName("注解.User");
        User user1 = (User)(c1.newInstance());
        Method getName=c1.getDeclaredMethod("getName",null);
        //开始时间
        long startTime1=System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            getName.invoke(user1,null);
        }
        //结束时间
        long endTime1=System.currentTimeMillis();
        System.out.println("普通方式"+(endTime1-startTime1));

        //Accessible
        Class c2=Class.forName("注解.User");
        User user2 = (User)(c1.newInstance());
        Method getName2=c1.getDeclaredMethod("getName",null);
        getName2.setAccessible(true);
        //开始时间
        long startTime2=System.currentTimeMillis();

        for (int i=0;i<1000000;i++){
            getName2.invoke(user2,null);
        }
        //结束时间
        long endTime2=System.currentTimeMillis();
        System.out.println("普通方式"+(endTime2-startTime2));
    }
}
