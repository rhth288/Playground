import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int strcnt=1;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
         System.out.print(row);
          
        }
        System.out.print("\n");
      }
	}
}