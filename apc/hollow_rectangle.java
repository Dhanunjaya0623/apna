import java.util.*;
public class hollow_rectangle {
    public static void holl_rect(int totrows,int totcols){
          //outerloop
          for(int i=1;i<=totrows;i++){

            for(int j=1;j<=totcols;j++){
               if(j==1 || j==totcols ||i==1||i==totrows){
                System.out.print("*");
               }
            else{
            System.out.print(" ");
            }
          }
          System.out.println();
    }
}
    public static void main(String[]args){
        holl_rect(4,5);
    }
}
