import java.util.*;
class loops{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       /*  int n=sc.nextInt();
        int soe=0;
        int soo=0;
        for(int i=1;i<=n;i++){
if(i%2==0){

    soe+=i;
    
}else{
    soo+=i;
}}
System.out.print(soe+"sumofeven integers");
System.out.print(soo+"sumofodd integers");
        

int num=sc.nextInt();
int fact=1;
for(int i=num;i>=1;i--){
fact*=i;
}
System.out.print(fact);

int n=sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(n+"*"+i+"="+n*i);
}
//print reverseof number
int n=1098;
while(n>0){
 int    lastDigit=n%10;
    System.out.print(lastDigit);
   n=n/10;
}
System.out.println();
*/
//reverse the number
int n=1098;
int rev=0;
while(n>0){
 int    lastDigit=n%10;
     rev=(rev*10)+lastDigit;
   n=n/10;
}
System.out.println(rev);
    }

}