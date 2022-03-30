package 注解;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2022-01-25 23:38
 */
public class Text12 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method=Text12.class.getMethod("text01", Map.class, List.class);
        Type[] parameterizedTypes=method.getGenericParameterTypes();


        for(Type type:parameterizedTypes){
            System.out.println(type);
            if (type instanceof ParameterizedType){
                Type[] actualTypeArguments=((ParameterizedType)type).getActualTypeArguments();
                for(Type type1:actualTypeArguments){
                    System.out.println(type1);
                }
            }
        }

        Method method1=Text12.class.getMethod("map", null);
        Type parameterizedType=method1.getGenericReturnType();
            if (parameterizedType instanceof ParameterizedType){
                Type[] actualTypeArgument=((ParameterizedType)parameterizedType).getActualTypeArguments();
                for(Type type2:actualTypeArgument){
                    System.out.println(type2);
                }
            }

    }
    public void text01(Map<String,User> map, List<User> list){
        System.out.println("Text01");
    }
    public Map<String,User> map(){
        System.out.println("map");
        return null;
    }
}
