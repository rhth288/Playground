import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     
      Scanner n = new Scanner (System.in);
      int m = n.nextInt();
      int sum=0;
      int l;
      while(m>0)
      {
       l=m%10;
        sum=sum+l;
        m=m/10;
      }
      
      System.out.println(sum);
    }
}
	