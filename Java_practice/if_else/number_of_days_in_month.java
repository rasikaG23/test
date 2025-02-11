package Java_practice.if_else;
import java.util.Scanner;

public class number_of_days_in_month { 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a month number...");
        int month=sc.nextInt();

        
        int days=0;
        

        if(month==1 || month==3|| month==5|| month==7|| month==8|| month==10|| month==12){
                days=31;
                System.out.println("Number of days in month is:" + days);
        } else if(month==4 || month==6|| month==9|| month==11){
            days=30;
            System.out.println("Number of days in month is:" + days);
        } else if(month==2){
            if(month%4==0){
                days=29;
                System.out.println("Number of days in month is:" + days);
            }else{
                days=28;
                System.out.println("Number of days in month is:" + days);
            }
        }else{
            System.out.println("Invalid month");
        }
            
       
        }
}
