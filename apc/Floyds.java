import java.util.*;
public class Floyds {
    public static void flods(int n){
        
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int num=1;num<=i;num++){
                System.out.print(counter);
counter++;

}
            System.out.println();
        }
    }
    public static void main(String[]args){
        flods(5);
    }
}
