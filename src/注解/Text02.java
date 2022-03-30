package 注解;

import java.lang.annotation.*;

/**
 * @author shkstart
 * @create 2022-01-24 19:10
 */
public class Text02 {
}
//一个类只能有一个public 内部类不能加public
//public  @interface MyAnnotation

/*Target表示注解可以用在哪些地方
如下表示可以用在class和方法中*/
@Target(value={ElementType.TYPE,ElementType.METHOD})
/*Retention表示注解在哪些地方有效
如图表示在运行时有效 Runtime>Class>Source
 */
@Retention(value = RetentionPolicy.RUNTIME)
//Document表示是否将我们的注解生成在javadoc中
@Documented
//Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
