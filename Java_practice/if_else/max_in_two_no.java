package Java_practice.if_else;
import java.util.Scanner;

public class max_in_two_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a first Number...");
        int a=sc.nextInt();
        System.out.println("Enter a second Number...");
        int b=sc.nextInt();
        
        if(a>b){
            System.out.println("The greatest number is: " + a);
        }else{
            System.out.println("The greatest number is: " + b);
        }
    }
    
}
