import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner (System.in);
      int m=n.nextInt();
      int last=m%10;
      while(m>=10)
      {
       m = m/10;
         }
      int sum=last+m;
      System.out.println(sum);
	}
}