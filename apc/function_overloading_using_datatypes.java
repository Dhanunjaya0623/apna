import java.util.*;
public class function_overloading_using_datatypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[]args){
        System.out.println(sum(3,4));
        System.out.println(sum(2.8f,4.2f));
    }
}
