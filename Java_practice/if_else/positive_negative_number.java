package Java_practice.if_else;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        if(n==0){
            System.out.println("Its a neutral number");
            
        }
        
        else if(n>0){
            System.out.println("Its a positive number");
            
        }else {
            System.out.println("Its a negative number");
            
        }
    }
}