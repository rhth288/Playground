import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
      int n = s.nextInt();      
      int sum_of_dig=sumdig(n);
      System.out.print(sum_of_dig);
	}
  public static int sumdig(int m)
  {
   int sum=0;
    for(int i=1;i<=m;i++)
    {
     sum=sum+i; 
    }
    return sum;
  }
}