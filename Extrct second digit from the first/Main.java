import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n = new Scanner (System.in);
      int m = n.nextInt();
      while(m>=100)
      {
       m=m/10; 
      }
      int second = m%10;
      System.out.println(second);
    }
}