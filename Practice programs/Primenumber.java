import java.util.*;
class primenumber{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in); 
      System.out.println("Enter a number");
      int n=in.nextInt();
      int f=0;
      for(int i=1;i<=n;i++){
          if(n%i==0){
              f++;
          }
      }
      if(f==2){
          System.out.println("prime Number");
      }
      else{
          System.out.println("Not a prime number");
      }
      
     }
    
}
