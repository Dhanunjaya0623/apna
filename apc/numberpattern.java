import java.util.*;
/*
12345
1234
123
12
*/
public class numberpattern {
   public static void pattern(int n){
    for(int i=1;i<=n;i++){
        for(int num=1;num<=n-i+1;num++){
            System.out.print(num);
        }
        System.out.println();
    }
   }    
   public static void main(String[]args){
    pattern( 5);
   }
}
