package Java_practice.loops;

public class num_of_digit {
    public static void main (String [] args){
        int num=2345, count=0, rev=0;

        while(num!=0){
            rev=rev*10+num%10;

            num=num/10;
            count++;

        }
        System.out.println(count);

    }
    
}
