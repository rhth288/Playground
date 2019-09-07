import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner z = new Scanner(System.in);
    int d=z.nextInt();
    int a=0;
     int e=0;
     int b=0;
     int c=0;
     int s=0;
     a= d%10;
     e= d/10;
     b= e%10;
     c= d/100;
     s=(a*100)+(b*10)+c;
     System.out.println(s);
  }
}