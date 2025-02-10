package Java_practice.if_else;
import java.util.Scanner;

public class greatest_smallest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a first Number...");
        int a=sc.nextInt();
        System.out.println("Enter a second Number...");
        int b=sc.nextInt();
        System.out.println("Enter a  third Number...");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest number is: " + a);
            if(b>c){
                System.out.println("The smallest number is: " + c);
            }else{
                System.out.println("The smallest number is: " + b);
            }
        }else if(b>a && b>c){
            System.out.println("The greatest number is: " + b);
            if(a>c){
                System.out.println("The smallest number is: " + c);
            }else{
                System.out.println("The smallest number is: " + b);
            }
        } else{
            System.out.println("The greatest number is: " + c);
            if(b>a){
                System.out.println("The smallest number is: " + a);
            }else{
                System.out.println("The smallest number is: " + b);
            }
        }
    }
    
}
