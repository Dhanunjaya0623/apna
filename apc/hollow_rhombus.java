import java.util.*;
public class hollow_rhombus {
    public static void hol_rh(int n){
//number of lines
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                 if (i == 1 || i == n || j == 1 || j == n ){
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
        hol_rh(5);
    }      
        
    
}
//if(i==1 && i==4 && (i+j)==6){
        //            System.out.print("*");
           // }