package Java_practice.loops;
import java.util.Scanner;

public class revers_number {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int num=sc.nextInt();
        int rev=0;
       
        while(num!=0){

            System.out.println(num%10);
            rev= rev *10 +num%10;

            num=num/10;

            


        }
        System.out.println(rev);
    }
    
}
