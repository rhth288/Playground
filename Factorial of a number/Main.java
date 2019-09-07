import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int n , fact;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      fact=1;
      for(int i=1;i<=n;i++)
      {
       fact=fact*i; 
      }
      System.out.println(fact);
	}
  
  
}