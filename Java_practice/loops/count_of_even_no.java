package Java_practice.loops;

public class count_of_even_no {
public static void main(String [] args){

    int count=0;

    for(int i=1; i<=100; i++){
        if(i%2==0){
            count++;
        }

    }
    System.out.println("COUNT OF EVEN NUMBER:-"  + count);
}


    
    
}
