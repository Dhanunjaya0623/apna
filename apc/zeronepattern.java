import java.util.*;
/*
1
01
101
0101
*/
public class zeronepattern {
    public static void zo(int n){
         int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j || (i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
zo(5);
    }
}
