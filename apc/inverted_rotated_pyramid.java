import java.util.*;
/*
   *
  **
 ***
**** 
*/
public class inverted_rotated_pyramid {
    public static void inv_pyramid(int n){
        for(int row=1;row<=n;row++){
            //spaces
            for(int j=1;j<=n-row;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        inv_pyramid( 4);
    }
}
