package 注解;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * @author shkstart
 * @create 2022-01-26 0:14
 */
public class Text13 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c3=Class.forName("注解.Police");
        //获得一整个注解
        Annotation[] a=c3.getAnnotations();
        for(Annotation b:a){
            System.out.println(b);
        }

        //获得注解里的信息
        ClassAnnotation classAnnotation=(ClassAnnotation) c3.getAnnotation(ClassAnnotation.class);
        String value=classAnnotation.value();
        System.out.println(value);

        Field f=c3.getDeclaredField("id");//变量名
        FieldAnnotation fieldAnnotation=f.getAnnotation(FieldAnnotation.class);
        System.out.println(fieldAnnotation.name());
        System.out.println(fieldAnnotation.age());
        System.out.println(fieldAnnotation.id());
    }
}

@ClassAnnotation("wowow")
class Police{
    @FieldAnnotation(name="222",id=001,age=18)
    String name;
    @FieldAnnotation(name="333",id=002,age=19)
    int id;
    @FieldAnnotation(name="444",id=003,age=20)
    int age;

    public Police(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

//类的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  ClassAnnotation{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnnotation{
    String name();
    int id();
    int age();
}