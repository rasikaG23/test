package Java_practice.loops;

public class armstrong_number {
    public static void main(String[] args) {
        int num = 370;
        int count = 0;
        int rev = 0, a = 0, ans = 0, b = 0;
        int n = num;
        int y=num;

        while (num != 0) {
            // a=num%10;
            rev = rev * 10 + num % 10;

            num = num / 10;
            count++;

        }

        // System.out.println(n);

        for (int i = 1; i <= count; i++) {

            int z = n % 10;
            n = n / 10;
            int initial_Sum=1;
            //System.out.println(count);
            // System.out.println(initial_Sum);
            // System.out.println(ans);

            for(int j=1; j<=count; j++){
                initial_Sum=initial_Sum*z;


            }
            ans=ans+initial_Sum;

           // System.out.println("value of z " + z);

        }
         //System.out.println( ans);

         if(y==ans){
            System.out.println("Armstrong number");
         }else{
            System.out.println("Not a armstrong Number");
         }

    }

}
