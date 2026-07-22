import java.util.*;
public class condstate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       /*  int number=sc.nextInt();
        if(number>0){
            System.out.print("positive");
        }else{
            System.out.print("negative");
        }
       int temp=80;
       String status=(temp>100)?"fever":"no fever";
       System.out.print(status);
       
      int week_num=sc.nextInt();
      switch(week_num){
        case 1:System.out.print("mon");
        break;
        case 2:System.out.print("tue");
        break;
        case 3:System.out.print("wed");
        break;
        case 4:System.out.print("thur");
        break;
        case 5:System.out.print("fri");
        break;
        case 6:System.out.print("sat");
        break;
        default :System.out.print("sun");
        */
       int year = sc.nextInt();

// Correct leap-year condition
String display = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))? "leapyear" : "noleap";
      System.out.print(display);
      
    }
    
}
