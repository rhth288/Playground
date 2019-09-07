import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int m=3;
    for(int strcnt=1;strcnt<=n;strcnt++)
    {
     System.out.print(strcnt);
      if((strcnt%3==0)&&(strcnt!=n))
      {
        System.out.print(",");
      }
    }
  }
}