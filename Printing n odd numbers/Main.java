import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int n;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      for(int count = 1; count<=2*n;count++)
      {
       if(count%2==1)
       {
         
        System.out.println(count); 
         count=count+1;
         
       }
        
      }
      
	}
}