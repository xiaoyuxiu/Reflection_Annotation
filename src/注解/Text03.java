package 注解;

import javax.swing.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shkstart
 * @create 2022-01-24 23:21
 */
public class Text03 {
    @MyAnotation1(name="秀秀")
    public void text(){
    }

    @MyAnotation2("我们")
    public void test(){
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation1{
    String name();
    int age() default -1;
    String[] sch() default {"西部大学","工业大学"};
    String school() default "";
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation2{
    String value();

}
