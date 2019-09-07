import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n , count;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      int sum=0;
      for(count=1;count<=n;count++)
      {
       
       sum=sum+count; 
         
        
      }
      System.out.println(sum);
      count=count+1;
	}
}