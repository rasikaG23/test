package Java_practice.loops;
import java.util.Scanner;

public class print_table {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter a number");

        int n=sc.nextInt();
        int num;

        for(int i=1; i<=10; i++){

            num=n*i;

            System.out.println( num);

        }


    }
}
