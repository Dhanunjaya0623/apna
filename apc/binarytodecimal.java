import java.util.*;
public class binarytodecimal {
    public static void bintodec(int n){
        int pow=0;
        int num=n;
        int dec=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+lastdigit*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
System.out.print("decimal of"+ num +"="+dec);
    }
    public static void main(String[]args){
       bintodec(1011);
    }
}
