package Java_practice.loops;

public class fibonacci_series{
    public static void main (String [] args){

        int firstNum=0;
        int secondNum=1;
        int nextNum;
        String fibonacciSeries="";

        for(int i=1; i<=20; i++){
           fibonacciSeries= firstNum + ", ";
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;

            System.out.print(fibonacciSeries);

        }
        
    }
}

// F(0) = 0  
// F(1) = 1  
// F(n) = F(n-1) + F(n-2) for n > 1  

