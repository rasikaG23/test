package Java_practice.loops;

public class count_of_odd_number {
    public static void main (String args []){

        int count =0;
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println("Count of odd number " + count);
    }
    
}
