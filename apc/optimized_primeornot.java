  import java.util.*;
public class optimized_primeornot {
    //onlyfor n>=2
    public static boolean Isprime(int n){
        boolean Isprime=true;
if(n==2){
    return true;
}
for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0)
        Isprime=false;
}
return Isprime;
    }
    public static void main(String[]args){
        System.out.println(Isprime(6));
    }
}


