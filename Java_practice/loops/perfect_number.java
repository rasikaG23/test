package Java_practice.loops;

public class perfect_number {
    public static void main(String []args){

        String perfectNumber="";
        
        for(int i=1; i<=100; i++){
            int sum=0;
            for(int num=1; num<i; num++){
                if(i%num==0){
                    sum=sum+num;



                }

                
            }
            
            if(sum==i){
                perfectNumber=perfectNumber+ i+ " ";
            }

            
            
        }
        System.out.println("perfect numbers are:- " + perfectNumber);
    }
    
}
