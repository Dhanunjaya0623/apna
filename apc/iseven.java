import java.util.*;
public  class iseven{
    public static boolean Iseven(int n){
        boolean Iseven=true;
        if(n%2==0){
            return Iseven;
        }else{
            Iseven=false;
        }
        return Iseven;
    }
public static void main(String[]args){
    System.out.println(Iseven(4));
}
}
