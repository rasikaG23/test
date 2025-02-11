package Java_practice.if_else;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a year...") ;
        int year=sc.nextInt();
    
    if(year%4==0){
        System.out.println("Its a leap year");
    }
    else{
        System.out.println("Its not a leap year");
    }
    }
    
}
