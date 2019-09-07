import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	  Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int square=sqrdig(n);
      System.out.print(square);
	}
  public static int sqrdig(int m)
  {
     int sqr=m*m;
    return sqr;
  }
  
}