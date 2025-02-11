package Java_practice.loops;

public class prime_number {
    public static void main (String [] args){

        
        String primeNumber="";

        for(int i=0; i<=100; i++){
            int count=0;
            for(int num=i; num>=1;num--){
                if(i%num==0){
                    count++;
                }
                
               
            }
            if(count==2){
                primeNumber=primeNumber + i+ " ";
               
            }

          

            
        }
        System.out.println(primeNumber);
    }
    
}
