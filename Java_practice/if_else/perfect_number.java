package Java_practice.if_else;

public class perfect_number {
    public static void main(String [] args){
      int sum=0;
      int num=28;

      for(int i=1; i<num ; i++){
        if(num%i==0){
            sum=sum+i;
            //System.out.println(sum);
        }
      }
    
     if(sum==num){
         System.out.println("PERFECT NUMBER");
     }else{
         System.out.println("Not a perfect Number");
     }
}
    
}
