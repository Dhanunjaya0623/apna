import java.util.*;
public class palindrome_ornot {
    public static void Ispalin(int n){
        int originalnumber=n;
        int rev=0;
        while(n>0){
        int lastdigit=n%10;
        rev=rev*10+lastdigit;
        n=n/10;
        }
        if(rev==originalnumber){
            System.out.println("number is a paloindrome");
        }else{
            System.out.println("number is not a paloindrome");
        }
    }
    public static void main(String[]args){
        Ispalin(132);
    }
    
}
