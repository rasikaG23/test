package Java_practice.loops;

public class strong_num {
    public static void main(String [] args){
        int num=4055, sum=0, a=0, rev=0, count=0;
        int n=num;

        // while(n>0){
        //     rev = rev * 10 + num % 10;

        //     num = num / 10;
        //     count++;
        // }

        while(n>0){
            a=n%10;
            n=n/10;
            int initial_Sum=1;
           // System.out.println(a);

            for(int j=a; j>=1; j--){

                initial_Sum=initial_Sum*j;

                // System.out.println(initial_Sum);

            }
            sum=sum+initial_Sum;
            

        }
        if(sum==num){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }

       
    }
    
}
