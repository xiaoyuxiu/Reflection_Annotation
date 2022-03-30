package 注解;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-01-24 15:20
 */
public class Text01 extends Object{
    //重写注解
    @Override
    public String toString(){

        return super.toString();
    }
    @Deprecated
    public static void Text01(){
        System.out.println("已过时");
    }
    @SuppressWarnings("all")
    public void test02(){
        List list=new ArrayList();
    }

    public static void main(String[] args) {
        Text01();
    }
}
