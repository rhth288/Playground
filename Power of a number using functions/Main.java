import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,p,r=1;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      p=s.nextInt();
      r=calpower(n,p);
      System.out.print(r);
	}
  public static int calpower(int m , int n1)
  {
    int r1=1;
    if(m>=0&&n1==0)
      r1=1;
    else if(m==0&&m>=1)
      r1=0;
    else
      for(int i=1;i<=n1;i++)
      {
      r1=r1*m;
      }
    return r1;
  }
}