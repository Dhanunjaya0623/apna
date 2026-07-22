import java.util.*;
public class patterns {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*
        *
        **
        ***
        ****
         
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
    System.out.println();
    }
    
    ****
    ***
    **
    *
   

   int n=sc.nextInt();
   for(int line=1;line<=n;line++){
    for(int star=1;star<n-line+1;star++){
        System.out.print("*");
    }
    System.out.println();
   }
         
 for(int line=1;line<=4;line++){
    for(int num=1;num<=line;num++){
        System.out.print(num);
    }
    System.out.println();
 }  
*/
/*
A
BC
DEF
GHIJ
KLMN */
int n=sc.nextInt();
char ch='A';
for(int line=1;line<=n;line++){
    for(int chars=1;chars<=line;chars++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

}

}
