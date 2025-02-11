package Java_practice.if_else;
import java.util.Scanner;

public class valid_trangle {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first angle of triangle...");
        int a=sc.nextInt();
        System.out.println("Enter the second angle of triangle...");
        int b=sc.nextInt();
        System.out.println("Enter the third angle of triangle...");
        int c=sc.nextInt();

        if(a+b+c==180){
            System.out.println("Its a valid triangle");
        }else{
            System.out.println("Its not a valid triangle");
        }
    }
    
}
