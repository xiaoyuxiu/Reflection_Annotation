package 注解;

import org.w3c.dom.ls.LSOutput;

import java.lang.annotation.Inherited;
import java.util.concurrent.Callable;

/**
 * @author shkstart
 * @create 2022-01-25 1:41
 */
public class Text07 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println(person.name);

        //方式1：通过对象获得
        Class c1=Class.forName("注解.Student");
        System.out.println(c1.hashCode());

        //方式2：forname获得
        Class c2=person.getClass();
        System.out.println(c2.hashCode());

        //方式三：通过类名.class获得
        Class c3=Student.class;
        System.out.println(c3.hashCode());

        //获得父类类型
        Class c4=c1.getSuperclass();
        System.out.println(c4);

        //基本内置类型的包装类都有一个Type属性
        Class c5= Integer.TYPE;
        System.out.println(c5);
    }
}
class Person{
    String name;

    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student(){
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name="教师";
    }
}