import java.util.*; 
class sumofdigits{
public static void main(String args[]){
int sum=0,n;
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
 n=in.nextInt();
while(n>0){
      sum=sum+n%10;
      n=n/10;

}
System.out.println("sum of Digits:"+ " "+sum);

}
}