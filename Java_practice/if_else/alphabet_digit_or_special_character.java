package Java_practice.if_else;
import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character...");
        char ch=sc.next().charAt(0);
        
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Its an alphabet");
        }else if(ch>='0' && ch<='9'){
            System.out.println("Its a digit");
        }else{
            System.out.println("Its a special character");
        }
    }
}