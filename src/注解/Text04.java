package 注解;

/**
 * @author shkstart
 * @create 2022-01-25 1:13
 */
public class Text04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的信息 包名+类名
        Class c1=Class.forName("注解.Text04");
        System.out.println(c1.hashCode());

        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构会被封装在Class对象里
        Class c2=Class.forName("注解.Text04");
        System.out.println(c2.hashCode());

        Class c3=Class.forName("注解.Text04");
        System.out.println(c3.hashCode());

        Class c4=Class.forName("注解.Text04");
        System.out.println(c4.hashCode());


    }
}
class User{
    String name;
    int age;
    int time;

    public User(String name, int age, int time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }
    public User(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(int time) {
        this.time = time;
    }
}