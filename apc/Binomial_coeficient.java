import java.util.*;
public class Binomial_coeficient {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static int bino_cof(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_minus_r_fact=factorial(n-r);
        int binomial= n_fact/(r_fact*n_minus_r_fact);
        return binomial;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=4;
       // System.out.println(factorial(num));
       System.out.println(bino_cof(5,2));
    }
}
