package 注解;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

/**
 * @author shkstart
 * @create 2022-01-25 17:00
 */
public class Text08 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器 App
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //获取系统类加载器的父类加载器————拓展类加载器
        ClassLoader parent=classLoader.getParent();
        System.out.println(parent);

        ////获取拓展类加载器的父类加载器————跟加载器  rt.jar获取不到所以为null
        ClassLoader parent1=parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        Class<?> classLoader1=Class.forName("注解.Text08");
        System.out.println(classLoader1);

        //测试JDK内置的类是谁加载的
       ClassLoader classLoader2=Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader2);

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));


    }

}
