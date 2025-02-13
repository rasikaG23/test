package Java_practice.loops;


public class palindrom {
    public static void main(String [] args){
        int n=232;
        int curr_num=n;

        int rev=0;

        while(n!=0){
            rev=rev*10 + n%10;
            
            n=n/10;
        }
       

        if (curr_num==rev){
            System.out.println("palindrom");
        }else{
            System.out.println("Not palindrom");
        }

        
    }
    
}
