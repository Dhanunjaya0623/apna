import java.util.*;
public class check_prime_or_not {
    //onlyfor n>=2
    public static boolean Isprime(int n){
        boolean Isprime=true;
if(n==2){
    return true;
}
for(int i=2;i<=n-1;i++){
    if(n%i==0)
        Isprime=false;
}
return Isprime;
    }
    //printallprimesin range
    public static void isprimesrange(int n){
        for(int i=2;i<=n;i++){
            if(Isprime(i)){
                System.out.print(i);
            }
        }
    }
    public static void main(String[]args){
       // System.out.println(Isprime(6));
       isprimesrange(8);
    }
}
